public class HomeScreen {
    private ManageAppointmentsClass controller = new ManageAppointmentsClass();

    // Ο χρήστης επιλέγει από το αρχικό μενού την επιλογή «Αξιολόγηση Ραντεβού»[cite: 42].
    public void clickReviewAppointment() {
        controller.showMyAppointments();
    }
}