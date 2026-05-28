import java.util.Scanner;

public class Main {
    private static boolean running = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println("\n--- ΕΠΙΛΟΓΗ ΛΟΓΑΡΙΑΣΜΟΥ ΣΥΝΔΕΣΗΣ ---");
            System.out.println("1. Σύνδεση ως Ιδιοκτήτης Κατοικιδίου");
            System.out.println("2. Σύνδεση ως Κτηνίατρος");
            System.out.println("3. Σύνδεση ως Γραμματεία");
            System.out.println("4. Κλείσιμο Εφαρμογής");
            System.out.print("Επιλογή (1-4): ");
            
            int choice = scanner.nextInt();
            if (choice == 4) { running = false; break; }
            if (choice >= 1 && choice <= 3) {
                HomeScreen.currentRole = choice;
                new HomeScreen().display();
            }
        }
        scanner.close();
    }

    public static void logout() {
        System.out.println("Αποσύνδεση επιτυχής.");
        HomeScreen.currentRole = 0;
    }
}