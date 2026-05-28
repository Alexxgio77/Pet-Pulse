public class ManageReviewScreen {
    private DBManager dbManager = new DBManager();

    public void checkReviewExistence(Appointment appointment) {
        if (dbManager.hasReview(appointment)) {
            new ExistingReviewsScreen(this, appointment).display();
        } else {
            new ReviewScreen(this, appointment).display();
        }
    }

    public void submitReview(int rating, String comments, Appointment appointment) {
        if (rating < 1 || rating > 5) {
            new ErrorScreen().display();
            new ReviewScreen(this, appointment).display();
        } else {
            dbManager.saveReview(new Review(rating, comments, appointment));
            System.out.println("✔ Η αξιολόγηση καταχωρήθηκε επιτυχώς!");
            new HomeScreen().display();
        }
    }
}