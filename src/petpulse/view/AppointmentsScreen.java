import java.util.List;

public class AppointmentsScreen {
    private ManageAppointmentsClass controller;

    public AppointmentsScreen(ManageAppointmentsClass controller) {
        this.controller = controller;
    }

    public void display(List<Appointment> appointments) {
        // Στήσιμο της λίστας ολοκληρωμένων ραντεβού στην οθόνη
    }

    public void selectAppointment(Appointment appointment) {
        controller.returnSelection(appointment);
    }
}