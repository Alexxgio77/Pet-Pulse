public class ExistingReviewsScreen {
    private ManageReviewScreen controller;
    private Appointment appointment;

    public ExistingReviewsScreen(ManageReviewScreen controller, Appointment appointment) {
        this.controller = controller;
        this.appointment = appointment;
    }

    public void display() {
        // Δείχνει το μήνυμα «Το ραντεβού έχει ήδη αξιολογηθεί»
    }

    // Ο χρήστης επιλέγει «Επεξεργασία αξιολόγησης»
    public void clickEditReview() {
        // Εμφανίζει τη φόρμα με τις προηγούμενες καταχωρήσεις του χρήστη
        ReviewScreen reviewScreen = new ReviewScreen(controller, appointment);
        reviewScreen.displayWithExistingData("Προηγούμενα σχόλια χρήστη", 4);
    }
}
