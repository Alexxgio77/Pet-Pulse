import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DBManager db = new DBManager();
        
        while (true) {
            System.out.println("\n=============================================");
            System.out.println("=== ΣΥΣΤΗΜΑ ΚΛΙΝΙΚΗΣ - ΕΠΙΛΟΓΗ ΡΟΛΟΥ ===");
            System.out.println("1. Είσοδος ως Ιδιοκτήτης");
            System.out.println("2. Είσοδος ως Κτηνίατρος");
            System.out.println("3. Είσοδος ως Γραμματεία");
            System.out.println("4. Έξοδος από την εφαρμογή");
            System.out.print("Επιλογή ρόλου (1-4): ");
            
            int role = scanner.nextInt();
            scanner.nextLine();
            
            if (role == 4) break;
            
            switch (role) {
                case 1: // MENU ΙΔΙΟΚΤΗΤΗ
                    System.out.println("\n--- ΜΕΝΟΥ ΙΔΙΟΚΤΗΤΗ ---");
                    System.out.println("1. Προγραμματισμός Ραντεβού");
                    System.out.println("2. Ακύρωση Ραντεβού");
                    System.out.println("3. Αξιολόγηση Ραντεβού");
                    System.out.println("4. Επεξεργασία Προφίλ");
                    System.out.print("Επιλογή: ");
                    int ownerChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (ownerChoice == 1) {
                        List<Pet> pets = db.fetchPets();
                        System.out.println("\nΕπιλέξτε ζώο:");
                        for (int i = 0; i < pets.size(); i++) System.out.println((i+1) + ". " + pets.get(i).getName());
                        int pSel = scanner.nextInt() - 1; scanner.nextLine();
                        
                        System.out.print("Δώσε Ημερομηνία/Ώρα: ");
                        String dt = scanner.nextLine();
                        db.saveAppointment(new Appointment(dt, pets.get(pSel)));
                        System.out.println("✔ Το ραντεβού κλείστηκε!");
                        
                    } else if (ownerChoice == 2) {
                        List<Appointment> apps = db.fetchAppointments();
                        if (apps.isEmpty()) { System.out.println("Δεν υπάρχουν ραντεβού."); break; }
                        for (int i = 0; i < apps.size(); i++) {
                            System.out.println((i+1) + ". " + apps.get(i).getDateTime() + " [" + apps.get(i).getStatus() + "]");
                        }
                        System.out.print("Επιλογή για ακύρωση: ");
                        int aSel = scanner.nextInt() - 1; scanner.nextLine();
                        apps.get(aSel).setStatus("Ακυρωμένο");
                        System.out.println("✔ Το ραντεβού ακυρώθηκε.");
                        
                    } else if (ownerChoice == 3) {
                        List<Appointment> apps = db.fetchAppointments();
                        if (apps.isEmpty()) { System.out.println("Πρέπει να έχεις ραντεβού για να αξιολογήσεις."); break; }
                        System.out.println("Επιλέξτε ραντεβού για αξιολόγηση:");
                        for (int i = 0; i < apps.size(); i++) System.out.println((i+1) + ". " + apps.get(i).getDateTime());
                        int aSel = scanner.nextInt() - 1; scanner.nextLine();
                        
                        System.out.print("Βαθμολογία (1-5): ");
                        int rating = scanner.nextInt(); scanner.nextLine();
                        System.out.print("Σχόλια: ");
                        String comm = scanner.nextLine();
                        
                        db.saveReview(new Review(rating, comm, apps.get(aSel)));
                        System.out.println("✔ Η αξιολόγηση καταχωρήθηκε!");
                        
                    } else if (ownerChoice == 4) {
                        System.out.println("\nΤρέχον Όνομα: " + DBManager.ownerName);
                        System.out.print("Νέο Όνομα: ");
                        DBManager.ownerName = scanner.nextLine();
                        System.out.println("✔ Το προφίλ ενημερώθηκε.");
                    }
                    break;

                case 2: // MENU ΚΤΗΝΙΑΤΡΟΥ
                    System.out.println("\n--- ΜΕΝΟΥ ΚΤΗΝΙΑΤΡΟΥ ---");
                    System.out.println("1. Επεξεργασία Προφίλ (Βιογραφικό)");
                    System.out.println("2. Έκδοση Συνταγής / Έλεγχος Φαρμάκων");
                    System.out.print("Επιλογή: ");
                    int vetChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (vetChoice == 1) {
                        System.out.println("\nΤρέχον Βιογραφικό: " + DBManager.vetBio);
                        System.out.print("Νέο Βιογραφικό: ");
                        DBManager.vetBio = scanner.nextLine();
                        System.out.println("✔ Το βιογραφικό άλλαξε.");
                    } else if (vetChoice == 2) {
                        List<Drug> drugs = db.fetchDrugs();
                        System.out.println("\nΔιαθέσιμα Φάρμακα στην Κλινική:");
                        for (int i = 0; i < drugs.size(); i++) {
                            System.out.println((i+1) + ". " + drugs.get(i).getName() + " | Απόθεμα: " + drugs.get(i).getStock());
                        }
                        System.out.print("Επιλέξτε φάρμακο για συνταγή: ");
                        int dSel = scanner.nextInt() - 1; scanner.nextLine();
                        
                        System.out.print("Ποσότητα που χρειάζεται το ζώο: ");
                        int qty = scanner.nextInt(); scanner.nextLine();
                        
                        if (drugs.get(dSel).isAvailable(qty)) {
                            drugs.get(dSel).setStock(drugs.get(dSel).getStock() - qty);
                            System.out.println("✔ Η συνταγή εκδόθηκε επιτυχώς!");
                        } else {
                            System.out.println("❌ Δεν φτάνει το απόθεμα! (Ενεργοποίηση Use Case: Αίτηση Παραγγελίας Φαρμάκου)");
                            System.out.println("✔ Η αίτηση στάλθηκε αυτόματα στη Γραμματεία.");
                        }
                    }
                    break;

                case 3: // MENU ΓΡΑΜΜΑΤΕΙΑΣ
                    System.out.println("\n--- ΜΕΝΟΥ ΓΡΑΜΜΑΤΕΙΑΣ ---");
                    System.out.println("1. Διαχείριση Φαρμακείου (Παραγγελίες)");
                    System.out.println("2. Διαχείριση Ωραρίου (Βάρδιες)");
                    System.out.print("Επιλογή: ");
                    int clerkChoice = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (clerkChoice == 1) {
                        System.out.print("Όνομα φαρμάκου για παραγγελία/ανεφοδιασμό: ");
                        String dName = scanner.nextLine();
                        System.out.print("Ποσότητα παραγγελίας: ");
                        int qty = scanner.nextInt(); scanner.nextLine();
                        
                        db.addDrugStock(dName, qty);
                        System.out.println("✔ Το απόθεμα ενημερώθηκε στη βάση.");
                    } else if (clerkChoice == 2) {
                        List<String> prog = db.fetchProgram();
                        System.out.println("\nΤρέχον Πρόγραμμα Βαρδιών:");
                        for (int i = 0; i < prog.size(); i++) System.out.println(i + ". " + prog.get(i));
                        
                        System.out.print("Επιλέξτε δείκτη ημέρας για αλλαγή: ");
                        int day = scanner.nextInt(); scanner.nextLine();
                        System.out.print("Γράψτε τη νέα βάρδια (π.χ. Πρωί-Νίκος): ");
                        String details = scanner.nextLine();
                        
                        db.updateProgram(day, details);
                        System.out.println("✔ Το ωράριο κοινοποιήθηκε στην εφαρμογή.");
                    }
                    break;
            }
        }
        System.out.println("Έξοδος. Καλή συνέχεια!");
        scanner.close();
    }
}