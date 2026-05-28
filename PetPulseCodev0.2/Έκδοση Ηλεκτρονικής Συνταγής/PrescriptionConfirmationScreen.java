import java.util.Scanner;

public class PrescriptionConfirmationScreen {
    private UploadManager manager;
    public PrescriptionConfirmationScreen(UploadManager m) { this.manager = m; }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Επιβεβαίωση έκδοσης συνταγής; (1=Ναι, 2=Όχι): ");
        if (scanner.nextInt() == 1) manager.confirm(); else manager.cancel();
    }
}