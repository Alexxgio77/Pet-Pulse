import java.util.List;
import java.util.Scanner;

public class PrescriptionDrugSelectionScreen {
    public void display(List<Drug> drugs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΕΠΙΛΟΓΗ ΦΑΡΜΑΚΟΥ ---");
        for (int i = 0; i < drugs.size(); i++) {
            System.out.println((i+1) + ". " + drugs.get(i).getName() + " [Διαθέσιμο: " + drugs.get(i).getStock() + "]");
        }
        System.out.print("Επιλογή φαρμάκου: ");
        int choice = scanner.nextInt() - 1;
        System.out.print("Ποσότητα: ");
        int qty = scanner.nextInt();
        
        if (choice >= 0 && choice < drugs.size()) {
            if (drugs.get(choice).isAvailable(qty)) {
                drugs.get(choice).setStock(drugs.get(choice).getStock() - qty);
                new UploadManager().prepConf();
            } else {
                System.out.println("❌ Ανεπαρκές Απόθεμα!");
                new DrugManager().init(); // Μετάβαση στο UC 9
            }
        }
    }
}