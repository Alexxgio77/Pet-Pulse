import java.util.ArrayList;
import java.util.List;

public class ManageAppointmentsClass {
    private Appointment selectedAppointment;
    private HomeScreen homeScreen = new HomeScreen();

    // Ανάκτηση και εμφάνιση των κλεισμένων ραντεβού
    public void showMyAppointments() {
        // Προσομοίωση findMyAppointments() από το AppointmentsDB
        List<Appointment> myAppointments = new ArrayList<>();
        // Υποθέτουμε ότι η λίστα γεμίζει με τα υπάρχοντα ραντεβού από τη βάση
        
        AppointmentsScreen appScreen = new AppointmentsScreen(this);
        appScreen.display(myAppointments);
    }

    // Καλείται όταν ο χρήστης επιλέξει ποιο ραντεβού θέλει να διαγράψει
    public void returnSelection(Appointment appointment) {
        this.selectedAppointment = appointment;
        
        ConfirmationScreen confScreen = new ConfirmationScreen(this);
        confScreen.display();
    }

    // Καλείται αν ο χρήστης πατήσει "Επιβεβαίωση" στο alt block
    public void confirm() {
        // Προσομοίωση removeAppointment() στο AppointmentsDB
        System.out.println("Διαγραφή από τη βάση του ραντεβού");
        selectedAppointment.setStatus("Ακυρωμένο");
        
        System.out.println("Το ραντεβού ακυρώθηκε επιτυχώς");
        homeScreen.display();
    }

    // Καλείται αν ο χρήστης πατήσει "Ακύρωση" στο alt block
    public void cancel() {
        System.out.println("Η διαδικασία ακυρώθηκε");
        showMyAppointments(); // Επιστροφή στη λίστα ραντεβού
    }
}