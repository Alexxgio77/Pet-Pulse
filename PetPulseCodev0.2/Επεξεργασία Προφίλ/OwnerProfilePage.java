import java.util.Scanner;

public class OwnerProfilePage {
    private ProfileManager manager;
    public OwnerProfilePage(ProfileManager m) { this.manager = m; }

    public void display(String currentName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΠΡΟΦΙΛ ΙΔΙΟΚΤΗΤΗ ---");
        System.out.println("Τρέχον Όνομα: " + currentName);
        System.out.print("Νέο όνομα: ");
        String name = scanner.nextLine();
        manager.onDataValidated(new ValidationClass().validateData(name), name);
    }
}