import java.util.List;
import java.util.Scanner;

public class ManagedDrugsClass {
    private DBManager dbManager = new DBManager();

    public void init() {
        List<Drug> drugs = dbManager.fetchDrugs();
        if (drugs.isEmpty()) {
            System.out.println("\n❌ Δεν υπάρχουν διαθέσιμα φάρμακα στην αποθήκη.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ΔΙΑΧΕΙΡΙΣΗ ΦΑΡΜΑΚΩΝ (ΑΠΟΘΗΚΗ) ---");
            for (int i = 0; i < drugs.size(); i++) {
                System.out.println((i + 1) + ". " + drugs.get(i).getName() + " | Απόθεμα: " + drugs.get(i).getStock() + " τεμ.");
            }
            System.out.println((drugs.size() + 1) + ". Επιστροφή στο Μενού");
            System.out.print("Επιλέξτε φάρμακο για ανεφοδιασμό: ");

            String input = scanner.nextLine().trim();
            
            try {
                int choice = Integer.parseInt(input) - 1;
                
                if (choice >= 0 && choice < drugs.size()) {
                    new ManageOrderClass().init(drugs.get(choice).getName());
                    return; // Επιστροφή στο μενού γραμματείας μετά την ολοκλήρωση της παραγγελίας
                } else if (choice == drugs.size()) {
                    return; // Επιστροφή στο μενού γραμματείας
                } else {
                    System.out.println("\n❌ Μη έγκυρη είσοδος. Επιλέξτε έναν από τους αναγραφόμενους αριθμούς.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\n❌ Μη έγκυρη είσοδος. Παρακαλώ εισάγετε αριθμό.");
            }
        }
    }
}