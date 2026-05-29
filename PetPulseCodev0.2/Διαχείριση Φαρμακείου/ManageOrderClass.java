import java.util.Scanner;

public class ManageOrderClass {
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Εισάγετε ποσότητα τεμαχίων για παραγγελία: ");
        int qty = scanner.nextInt();
        new DBManager().addOrderedItems(qty);
        new PharmacyOrderConfirmationScreen().display();
    }
}