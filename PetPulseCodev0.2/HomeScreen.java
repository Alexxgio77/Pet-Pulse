import java.util.Scanner;

public class HomeScreen {
    public static int currentRole;

    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ΚΕΝΤΡΙΚΟ ΜΕΝΟΥ ΕΦΑΡΜΟΓΗΣ ---");
            System.out.println("1. Σύνδεση ως Ιδιοκτήτης Κατοικιδίου");
            System.out.println("2. Σύνδεση ως Κτηνίατρος");
            System.out.println("3. Σύνδεση ως Γραμματεία");
            System.out.println("4. Έξοδος Εφαρμογής");
            System.out.print("Επιλογή (1-4): ");
            
            String role = scanner.nextLine().trim();
            
            if (role.equals("1")) {
                currentRole = 1;
                ownerMenu();
            } else if (role.equals("2")) {
                currentRole = 2;
                vetMenu();
            } else if (role.equals("3")) {
                currentRole = 3;
                staffMenu();
            } else if (role.equals("4")) {
                System.out.println("Έξοδος από την εφαρμογή.");
                System.exit(0);
            } else {
                System.out.println("Μη έγκυρη επιλογή. Δοκιμάστε ξανά.");
            }
        }
    }

    private void ownerMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=================================");
            System.out.println("--- ΚΕΝΤΡΙΚΟ ΜΕΝΟΥ ΙΔΙΟΚΤΗΤΗ ---");
            System.out.println("1. Προγραμματισμός Ραντεβού");
            System.out.println("2. Ακύρωση Ραντεβού");
            System.out.println("3. Αξιολόγηση Ραντεβού");
            System.out.println("4. Επεξεργασία Προφίλ");
            System.out.println("5. Προβολή Ιστορικού Κατοικιδίου");
            System.out.println("6. Αποσύνδεση");
            System.out.print("Επιλογή: ");
            
            String ch = scanner.nextLine().trim();
            if (ch.equals("1")) {
                ManageAppointmentsClass mac = new ManageAppointmentsClass();
                if (!DBManager.petsTable.isEmpty()) {
                    mac.findAvailableAppointments(DBManager.petsTable.get(0));
                } else {
                    System.out.println("Δεν υπάρχουν καταχωρημένα κατοικίδια.");
                }
            } else if (ch.equals("2")) {
                new ManageAppointmentsClass().showMyAppointments();
            } else if (ch.equals("3")) {
                new ManageAppointmentsClass().showAppointmentsForReview();
            } else if (ch.equals("4")) {
                new ProfileManager().retrieveProfileData();
            } else if (ch.equals("5")) {
                new PetManager().getPets();
            } else if (ch.equals("6")) {
                return; 
            } else {
                System.out.println("Λάθος επιλογή. Παραμένετε στο μενού Ιδιοκτήτη.");
            }
        }
    }

    private void vetMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ΜΕΝΟΥ ΚΤΗΝΙΑΤΡΟΥ ---");
            System.out.println("1. Προβολή Πελατών & Κατοικιδίων");
            System.out.println("2. Επεξεργασία Προφίλ Κτηνιάτρου");
            System.out.println("3. Προβολή Εξετασμένων Κατοικιδίων");
            System.out.println("4. Αποσύνδεση");
            System.out.print("Επιλογή (1-4): ");
            
            String ch = scanner.nextLine().trim();
            if (ch.equals("1")) {
                new PetManager().getPets();
            } else if (ch.equals("2")) {
                new ProfileManager().retrieveVetProfileData();
            } else if (ch.equals("3")) {
                new PetManager().getExaminedPets();
            } else if (ch.equals("4")) {
                return;
            } else {
                System.out.println("Λάθος επιλογή. Παραμένετε στο μενού Κτηνιάτρου.");
            }
        }
    }

    private void staffMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ΜΕΝΟΥ ΓΡΑΜΜΑΤΕΙΑΣ ---");
            System.out.println("1. Διαχείριση Φαρμακείου");
            System.out.println("2. Προβολή Εβδομαδιαίου Προγράμματος");
            System.out.println("3. Αποσύνδεση");
            System.out.print("Επιλογή (1-3): ");
            
            String ch = scanner.nextLine().trim();
            if (ch.equals("1")) {
                new ManagedDrugsClass().init();
            } else if (ch.equals("2")) {
                new ProgramManager().getProgram();
            } else if (ch.equals("3")) {
                return;
            } else {
                System.out.println("Λάθος επιλογή. Παραμένετε στο μενού Γραμματείας.");
            }
        }
    }
}