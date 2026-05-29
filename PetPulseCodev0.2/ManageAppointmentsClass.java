import java.util.ArrayList;
import java.util.List;

public class ManageAppointmentsClass {
    private DBManager dbManager = new DBManager();
    private Pet selectedPet;
    private Appointment selectedAppointment;

    public void findAvailableAppointments(Pet pet) {
        this.selectedPet = pet;
        List<String> availableSlots = dbManager.fetchAvailableSlots();
        
        if (availableSlots.isEmpty()) {
            System.out.println("\n❌ Δεν υπάρχουν διαθέσιμα ραντεβού αυτή τη στιγμή!");
            new HomeScreen().display();
            return;
        }
        new AvailableSlotsScreen(this).display(availableSlots);
    }

    public void returnSelection(String dateTime) {
        dbManager.saveAppointment(new Appointment(dateTime, selectedPet));
        dbManager.removeAvailableSlot(dateTime);
        new AppointmentBookingConfirmationScreen().display();
    }

    public void showMyAppointments() {
        List<Appointment> allAppointments = dbManager.fetchAppointments();
        List<Appointment> scheduledOnly = new ArrayList<>();
        
        for (Appointment app : allAppointments) {
            if (app.getStatus().equalsIgnoreCase("Προγραμματισμένο")) {
                scheduledOnly.add(app);
            }
        }

        if (scheduledOnly.isEmpty()) {
            System.out.println("\n❌ Δεν βρέθηκαν ενεργά προγραμματισμένα ραντεβού για ακύρωση!");
            new HomeScreen().display();
            return;
        }

        new ActiveAppointmentsSelectionScreen(this).display(scheduledOnly);
    }

    public void returnSelection(Appointment appointment) {
        this.selectedAppointment = appointment;
        new AppointmentCancellationConfirmationScreen(this).display();
    }

    public void confirm() { 
        selectedAppointment.setStatus("Ακυρωμένο"); 
        System.out.println("\n✔ Το ραντεβού ακυρώθηκε με επιτυχία.");
        new HomeScreen().display(); 
    }
    
    public void cancel() { 
        new HomeScreen().display(); 
    }

    public void showAppointmentsForReview() {
        List<Appointment> allAppointments = dbManager.fetchAppointments();
        List<Appointment> completedOnly = new ArrayList<>();
        
        for (Appointment app : allAppointments) {
            if (app.getStatus().equalsIgnoreCase("Ολοκληρωμένο")) {
                completedOnly.add(app);
            }
        }

        if (completedOnly.isEmpty()) {
            System.out.println("\n❌ Δεν υπάρχουν ολοκληρωμένα ραντεβού προς αξιολόγηση!");
            new HomeScreen().display();
            return;
        }

        new CompletedAppointmentsSelectionScreen(this).display(completedOnly);
    }

    public void returnSelectionForReview(Appointment appointment) {
        new ManageReviewScreen().checkReviewExistence(appointment);
    }
}