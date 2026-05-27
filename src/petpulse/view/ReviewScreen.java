public class ReviewScreen {
    private ManageReviewScreen controller;
    private Appointment appointment;

    public ReviewScreen(ManageReviewScreen controller, Appointment appointment) {
        this.controller = controller;
        this.appointment = appointment;
    }

    public void display() {
        // Άνοιγμα κενής φόρμας
    }

    public void displayWithExistingData(String comments, int rating) {
        // Άνοιγμα φόρμας με συμπληρωμένα τα παλιά στοιχεία[cite: 55].
    }

    // Ο χρήστης βάζει τη βαθμολογία/σχόλια και πατάει «Υποβολή»[cite: 47, 56].
    public void clickSubmit(int rating, String comments) {
        controller.submitReview(rating, comments, appointment);
    }
}