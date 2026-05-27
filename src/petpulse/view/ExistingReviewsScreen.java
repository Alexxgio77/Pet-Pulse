public class ExistingReviewsScreen {
    private ManageReviewScreen controller;
    private Appointment appointment;

    public ExistingReviewsScreen(ManageReviewScreen controller, Appointment appointment) {
        this.controller = controller;
        this.appointment = appointment;
    }

    public void display() {
        // Δείχνει το μήνυμα «Το ραντεβού έχει ήδη αξιολογηθεί»[cite: 53].
    }

    // Ο χρήστης επιλέγει «Επεξεργασία αξιολόγησης»[cite: 54].
    public void clickEditReview() {
        // Εμφανίζει τη φόρμα με τις προηγούμενες καταχωρήσεις του χρήστη[cite: 55].
        ReviewScreen reviewScreen = new ReviewScreen(controller, appointment);
        reviewScreen.displayWithExistingData("Προηγούμενα σχόλια χρήστη", 4);
    }
}