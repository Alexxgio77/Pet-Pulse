import java.util.ArrayList;
import java.util.List;

public class ManageAppointmentsClass {
    
    // Το σύστημα εμφανίζει μια λίστα με όλα τα ραντεβού που έχει πραγματοποιήσει[cite: 43].
    public void showMyAppointments() {
        List<Appointment> completedAppointments = new ArrayList<>();
        // Εδώ τραβάμε τα δεδομένα από το AppointmentsDB
        
        AppointmentsScreen appScreen = new AppointmentsScreen(this);
        appScreen.display(completedAppointments);
    }

    // Ο χρήστης επιλέγει το ραντεβού που θέλει να αξιολογήσει[cite: 44].
    public void returnSelection(Appointment appointment) {
        ManageReviewScreen reviewScreen = new ManageReviewScreen();
        reviewScreen.checkReviewExistence(appointment);
    }
}