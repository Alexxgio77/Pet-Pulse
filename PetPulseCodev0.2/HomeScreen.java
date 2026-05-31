import java.util.Scanner;

public class HomeScreen {

    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ΚΕΝΤΡΙΚΟ ΜΕΝΟΥ ΕΦΑΡΜΟΓΗΣ ---");
            System.out.println("1. Σύνδεση ως Ιδιοκτήτης Κατοικιδίου");
            System.out.println("2. Σύνδεση ως Κτηνίατρος");
            System.out.println("3. Σύνδεση ως Γραμματεία");
            System.out.println("4. Έξοδος Εφαρμογής");
            System.out.print("Επιλογή (1-4): ");
            
            int role = scanner.nextInt();
            if (role == 1) {
                ownerMenu();
            } else if (role == 2) {
                vetMenu();
            } else if (role == 3) {
                staffMenu();
            } else if (role == 4) {
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
            System.out.println("\n--- ΜΕΝΟΥ ΙΔΙΟΚΤΗΤΗ ---");
            System.out.println("1. Διαχείριση Κατοικιδίων");
            System.out.println("2. Προγραμματισμός Ραντεβού");
            System.out.println("3. Ακύρωση Ραντεβού");
            System.out.println("4. Επεξεργασία Προφίλ");
            System.out.println("5. Προβολή Ιστορικού");
            System.out.println("6. Αποσύνδεση");
            System.out.print("Επιλογή (1-6): ");
            
            int ch = scanner.nextInt();
            if (ch == 1) {
                new ManagePetsClass().init();
            } else if (ch == 2) {
                ManageAppointmentsClass mac = new ManageAppointmentsClass();
                if (!DBManager.petsTable.isEmpty()) {
                    mac.findAvailableAppointments(DBManager.petsTable.get(0));
                } else {
                    System.out.println("Δεν υπάρχουν καταχωρημένα κατοικίδια.");
                }
            } else if (ch == 3) {
                new ManageAppointmentsClass().showMyAppointments();
            } else if (ch == 4) {
                new ProfileManager().retrieveProfileData();
            } else if (ch == 5) {
                new PetManager().getPets();
            } else if (ch == 6) {
                return; 
            } else {
                System.out.println("Λάθος αριθμός. Παραμένετε στο μενού Ιδιοκτήτη.");
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
            
            int ch = scanner.nextInt();
            if (ch == 1) {
                new PetManager().getPets();
            } else if (ch == 2) {
                new ProfileManager().retrieveVetProfileData();
            } else if (ch == 3) {
                new PetManager().getExaminedPets();
            } else if (ch == 4) {
                return;
            } else {
                System.out.println("Λάθος αριθμός. Παραμένετε στο μενού Κτηνιάτρου.");
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
            
            int ch = scanner.nextInt();
            if (ch == 1) {
                new ManagedDrugsClass().init();
            } else if (ch == 2) {
                new ProgramManager().getProgram();
            } else if (ch == 3) {
                return;
            } else {
                System.out.println("Λάθος αριθμός. Παραμένετε στο μενού Γραμματείας.");
            }
        }
    }
}