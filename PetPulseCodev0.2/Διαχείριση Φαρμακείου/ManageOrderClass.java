import java.util.Scanner;

public class ManageOrderClass {
    private DBManager dbManager = new DBManager();

    public void init(String drugName) {
        System.out.println("\n--- ΑΝΟΙΓΜΑ ΦΟΡΜΑΣ ΠΑΡΑΓΓΕΛΙΑΣ ΦΑΡΜΑΚΩΝ ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Εισάγετε ποσότητα τεμαχίων για ανεφοδιασμό: ");
        int qty = scanner.nextInt();
        
        if (qty <= 0) {
            System.out.println("\n❌ Σφάλμα: Η ποσότητα παραγγελίας πρέπει να είναι μεγαλύτερη από 0.");
            return;
        }
        
        order(drugName, qty);
    }

    public void order(String drugName, int quantity) {
        dbManager.addOrderedItems(quantity);
        dbManager.restockDrug(drugName, quantity);
        PharmacyOrderConfirmationScreen confScreen = new PharmacyOrderConfirmationScreen();
        confScreen.display();
    }
}