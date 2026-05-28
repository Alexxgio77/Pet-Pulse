public class ExistingReviewsScreen {
    public ExistingReviewsScreen(ManageReviewScreen c, Appointment a) {}
    public void display() {
        System.out.println("❌ Σφάλμα: Το ραντεβού αυτό έχει ήδη αξιολογηθεί!");
        new HomeScreen().display();
    }
}