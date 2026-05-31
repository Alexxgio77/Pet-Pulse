import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageAppointmentsClass {
    private DBManager dbManager = new DBManager();
    private Pet selectedPet;
    private Appointment selectedAppointment;

    public void findAvailableAppointments(Pet pet) {
        this.selectedPet = pet;
        List<String> availableSlots = dbManager.fetchAvailableSlots();
        
        if (availableSlots.isEmpty()) {
            System.out.println("\n❌ Δεν υπάρχουν διαθέσιμα ραντεβού αυτή τη στιγμή!");
            return; 
        }
        new AvailableSlotsScreen(this).display(availableSlots);
    }

    public void returnSelection(String dateTime) {
        dbManager.saveAppointment(new Appointment(dateTime, selectedPet));
        dbManager.removeAvailableSlot(dateTime);
        System.out.println("\n✔ Το ραντεβού προγραμματίστηκε με επιτυχία!");
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
            return; 
        }

        new ActiveAppointmentsSelectionScreen(this).display(scheduledOnly);
    }

    public void returnSelection(Appointment appointment) {
        this.selectedAppointment = appointment;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nΕίστε σίγουροι ότι θέλετε να ακυρώσετε το ραντεβού στις " + appointment.getDateTime() + ";");
        System.out.println("1. Ναι, Επιβεβαίωση");
        System.out.println("2. Όχι, Επιστροφή");
        System.out.print("Επιλογή: ");
        int conf = scanner.nextInt();
        
        if (conf == 1) {
            confirm();
        } else {
            cancel();
        }
    }

    public void confirm() { 
        selectedAppointment.setStatus("Ακυρωμένο"); 
        System.out.println("\n✔ Το ραντεβού ακυρώθηκε με επιτυχία.");
    }
    
    public void cancel() { 
        System.out.println("\nΗ ακύρωση του ραντεβού διακόπηκε.");
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
            return; 
        }

        new CompletedAppointmentsSelectionScreen(this).display(completedOnly);
    }

    public void returnSelectionForReview(Appointment appointment) {
        new ManageReviewScreen().checkReviewExistence(appointment);
    }
}