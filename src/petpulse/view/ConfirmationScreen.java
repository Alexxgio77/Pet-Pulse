public class ConfirmationScreen {
    private ManageAppointmentsClass controller;

    public ConfirmationScreen(ManageAppointmentsClass controller) {
        this.controller = controller;
    }

    public void display() {
        // Εμφάνιση παραθύρου επιβεβαίωσης στον χρήστη
    }

    // Event από το UI όταν ο χρήστης πατάει το OK
    public void clickConfirm() {
        controller.confirm();
    }

    // Event από το UI όταν ο χρήστης μετανιώνει και πατάει άκυρο
    public void clickCancel() {
        controller.cancel();
    }
}