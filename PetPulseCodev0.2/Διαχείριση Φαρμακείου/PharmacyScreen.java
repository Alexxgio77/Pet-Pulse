import java.util.Scanner;

public class PharmacyScreen {
    private ManagedDrugsClass controller;
    public PharmacyScreen(ManagedDrugsClass c) { this.controller = c; }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΔΙΑΧΕΙΡΙΣΗ ΦΑΡΜΑΚΕΙΟΥ ---");
        System.out.print("Αναζήτηση φαρμάκου με όνομα: ");
        controller.searchDrugs(scanner.nextLine());
    }
}