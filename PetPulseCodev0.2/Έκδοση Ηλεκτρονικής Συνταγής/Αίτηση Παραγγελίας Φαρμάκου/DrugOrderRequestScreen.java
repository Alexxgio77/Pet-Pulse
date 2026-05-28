import java.util.Scanner;

public class DrugOrderRequestScreen {
    private DrugManager manager;
    public DrugOrderRequestScreen(DrugManager m) { this.manager = m; }

    public void display(String catalog) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- " + catalog + " ---");
        System.out.print("Όνομα ελλιπούς φαρμάκου: ");
        String name = scanner.nextLine();
        System.out.print("Ποσότητα: ");
        int qty = scanner.nextInt();
        manager.makeOrder(name, qty, this);
    }
    public void successMessage() {
        System.out.println("✔ Η αίτηση παραγγελίας στάλθηκε στη Γραμματεία.");
    }
}