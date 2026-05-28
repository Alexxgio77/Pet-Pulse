import java.util.Scanner;

public class ReviewScreen {
    private ManageReviewScreen controller;
    private Appointment appointment;

    public ReviewScreen(ManageReviewScreen c, Appointment a) { this.controller = c; this.appointment = a; }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΦΟΡΜΑ ΑΞΙΟΛΟΓΗΣΗΣ ---");
        System.out.print("Βαθμολογία (1-5): ");
        int rating = scanner.nextInt(); scanner.nextLine();
        System.out.print("Σχόλια: ");
        String comments = scanner.nextLine();
        controller.submitReview(rating, comments, appointment);
    }
}