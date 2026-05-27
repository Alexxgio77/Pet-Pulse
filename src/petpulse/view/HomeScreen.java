public class HomeScreen {
    private ManageAppointmentsClass controller = new ManageAppointmentsClass();

    // Ο χρήστης επιλέγει από το αρχικό μενού την επιλογή «Αξιολόγηση Ραντεβού»
    public void clickReviewAppointment() {
        controller.showMyAppointments();
    
    
    private ManagedDrugsClass drugsController = new ManagedDrugsClass();

    // Ο χρήστης κάνει κλικ στην επιλογή «Διαχείριση Φαρμακείου» στην Αρχική Οθόνη [cite: 143]
    public void clickPharmacyManagement() {
        drugsController.init();
    }
}


