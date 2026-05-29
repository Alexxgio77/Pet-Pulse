import java.util.Scanner;

public class VetProfilePage {
    private ProfileManager manager;
    public VetProfilePage(ProfileManager m) { this.manager = m; }

    public void displayVetForm(String currentBio) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΠΡΟΦΙΛ ΚΤΗΝΙΑΤΡΟΥ ---");
        System.out.println("Βιογραφικό: " + currentBio);
        System.out.print("Νέο Βιογραφικό (>10 χαρακτήρες): ");
        String bio = scanner.nextLine();
        manager.onVetDataValidated(new ValidationClass().validateVetData(bio), bio);
    }
}