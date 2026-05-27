import java.util.List;

public class AppointmentsScreen {
    private ManageAppointmentsClass controller;

    public AppointmentsScreen(ManageAppointmentsClass controller) {
        this.controller = controller;
    }

    public void display(List<Appointment> myAppointments) {
        // Εμφάνιση της λίστας με τα προγραμματισμένα ραντεβού
    }

    // Καλείται με την επιλογή ενός ραντεβού από τη λίστα
    public void selectAppointment(Appointment appointment) {
        controller.returnSelection(appointment);
    }
}