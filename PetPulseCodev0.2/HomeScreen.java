import java.util.Scanner;

public class HomeScreen {
    public static int currentRole = 0; // 1=Owner, 2=Vet, 3=Clerk

    public void display() {
        Scanner scanner = new Scanner(System.in);
        if (currentRole == 0) return;

        System.out.println("\n=================================");
        if (currentRole == 1) {
            System.out.println("--- ΚΕΝΤΡΙΚΟ ΜΕΝΟΥ ΙΔΙΟΚΤΗΤΗ ---");
            System.out.println("1. Προγραμματισμός Ραντεβού (UC 1)");
            System.out.println("2. Ακύρωση Ραντεβού (UC 2)");
            System.out.println("3. Αξιολόγηση Ραντεβού (UC 3)");
            System.out.println("4. Επεξεργασία Προφίλ (UC 4)");
            System.out.println("5. Προβολή Ιστορικού Κατοικιδίου (UC 5)");
            System.out.println("6. Αποσύνδεση");
            System.out.print("Επιλογή: ");
            int ch = scanner.nextInt();
            if (ch == 1) new ManagePetsClass().init();
            else if (ch == 2) new ManageAppointmentsClass().showMyAppointments();
            else if (ch == 3) new ManageAppointmentsClass().showAppointmentsForReview();
            else if (ch == 4) new ProfileManager().retrieveProfileData();
            else if (ch == 5) new PetManager().getPets();
            else Main.logout();
        } 
        else if (currentRole == 2) {
            System.out.println("--- ΚΕΝΤΡΙΚΟ ΜΕΝΟΥ ΚΤΗΝΙΑΤΡΟΥ ---");
            System.out.println("1. Προβολή Ιστορικού Κατοικιδίου (UC 6)");
            System.out.println("2. Επεξεργασία Προφίλ (UC 7)");
            System.out.println("3. Έκδοση Ηλεκτρονικής Συνταγής (UC 8/9)");
            System.out.println("4. Αποσύνδεση");
            System.out.print("Επιλογή: ");
            int ch = scanner.nextInt();
            if (ch == 1) new PetManager().getPets();
            else if (ch == 2) new ProfileManager().retrieveVetProfileData();
            else if (ch == 3) new PetManager().getExaminedPets();
            else Main.logout();
        } 
        else if (currentRole == 3) {
            System.out.println("--- ΚΕΝΤΡΙΚΟ ΜΕΝΟΥ ΓΡΑΜΜΑΤΕΙΑΣ ---");
            System.out.println("1. Διαχείριση Φαρμακείου (UC 10)");
            System.out.println("2. Διαχείριση Ωραρίου (UC 11)");
            System.out.println("3. Αποσύνδεση");
            System.out.print("Επιλογή: ");
            int ch = scanner.nextInt();
            if (ch == 1) new ManagedDrugsClass().init();
            else if (ch == 2) new ProgramManager().getProgram();
            else Main.logout();
        }
    }
}