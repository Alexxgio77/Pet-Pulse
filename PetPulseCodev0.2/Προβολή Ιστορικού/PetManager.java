import java.util.List;
import java.util.Scanner;

public class PetManager {
    private DBManager dbManager = new DBManager();

    // 1. Προβολή Ιστορικού Κατοικιδίων (Ιδιοκτήτης)
    public void getPets() {
        List<Pet> pets = dbManager.fetchPets();
        if (pets.isEmpty()) {
            System.out.println("\n❌ Δεν υπάρχουν καταχωρημένα κατοικίδια στο σύστημα.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ΕΠΙΛΟΓΗ ΖΩΟΥ ΓΙΑ ΙΣΤΟΡΙΚΟ ---");
            for (int i = 0; i < pets.size(); i++) {
                System.out.println((i + 1) + ". " + pets.get(i).getName() + " [" + pets.get(i).getSpecies() + "]");
            }
            System.out.println((pets.size() + 1) + ". Επιστροφή στο Μενού");
            System.out.print("Επιλογή: ");

            String input = scanner.nextLine().trim();
            
            try {
                int choice = Integer.parseInt(input) - 1;
                
                if (choice >= 0 && choice < pets.size()) {
                    Pet selected = pets.get(choice);
                    System.out.println("\n--- ΙΣΤΟΡΙΚΟ ΡΑΝΤΕΒΟΥ ΓΙΑ: " + selected.getName() + " ---");
                    boolean hasHistory = false;
                    for (Appointment app : DBManager.appointmentsTable) {
                        if (app.getPet().getName().equalsIgnoreCase(selected.getName())) {
                            System.out.println("- Ημερομηνία: " + app.getDateTime() + " | Κατάσταση: " + app.getStatus());
                            hasHistory = true;
                        }
                    }
                    if (!hasHistory) {
                        System.out.println("Δεν υπάρχουν καταγεγραμμένα ραντεβού για αυτό το ζώο.");
                    }
                    return; // Επιστροφή στο μενού ιδιοκτήτη
                } else if (choice == pets.size()) {
                    return; // Επιστροφή στο μενού ιδιοκτήτη
                } else {
                    System.out.println("\n❌ Μη έγκυρη είσοδος. Επιλέξτε έναν από τους αναγραφόμενους αριθμούς.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\n❌ Μη έγκυρη είσοδος. Παρακαλώ εισάγετε αριθμό.");
            }
        }
    }

    // 2. Ηλεκτρονική Συνταγογράφηση (Κτηνίατρος)
    public void getExaminedPets() {
        List<Pet> pets = dbManager.fetchPets();
        if (pets.isEmpty()) {
            System.out.println("\n❌ Δεν υπάρχουν καταχωρημένα κατοικίδια στο σύστημα.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ΗΛΕΚΤΡΟΝΙΚΗ ΣΥΝΤΑΓΟΓΡΑΦΗΣΗ (ΕΠΙΛΟΓΗ ΖΩΟΥ) ---");
            for (int i = 0; i < pets.size(); i++) {
                System.out.println((i + 1) + ". " + pets.get(i).getName() + " [" + pets.get(i).getSpecies() + "]");
            }
            System.out.println((pets.size() + 1) + ". Επιστροφή στο Μενού");
            System.out.print("Επιλογή: ");

            String input = scanner.nextLine().trim();
            
            try {
                int choice = Integer.parseInt(input) - 1;
                
                if (choice >= 0 && choice < pets.size()) {
                    System.out.println("\n✔ Επιλέχθηκε επιτυχώς το ζώο " + pets.get(choice).getName() + " για έκδοση συνταγής.");
                    return; // Επιστροφή στο μενού κτηνιάτρου
                } else if (choice == pets.size()) {
                    return; // Επιστροφή στο μενού κτηνιάτρου
                } else {
                    System.out.println("\n❌ Μη έγκυρη είσοδος. Επιλέξτε έναν από τους αναγραφόμενους αριθμούς.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\n❌ Μη έγκυρη είσοδος. Παρακαλώ εισάγετε αριθμό.");
            }
        }
    }
}