import java.util.List;
import java.util.Scanner;

public class AvailableSlotsScreen {
    private ManageAppointmentsClass controller;

    public AvailableSlotsScreen(ManageAppointmentsClass c) {
        this.controller = c;
    }

    public void display(List<String> slots) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- ΟΘΟΝΗ ΔΙΑΘΕΣΙΜΩΝ ΩΡΩΝ ---");
            for (int i = 0; i < slots.size(); i++) {
                System.out.println((i + 1) + ". " + slots.get(i));
            }
            System.out.println((slots.size() + 1) + ". Επιστροφή στο Μενού");
            System.out.print("Επιλέξτε ώρα: ");
            
            int choice = scanner.nextInt() - 1;
            
            if (choice >= 0 && choice < slots.size()) {
                controller.returnSelection(slots.get(choice));
                return; // Έξοδος από την οθόνη αφού έγινε σωστή επιλογή
            } else if (choice == slots.size()) {
                return; // Επιστροφή στο μενού του Ιδιοκτήτη
            } else {
                System.out.println("\n❌ Μη έγκυρη είσοδος.");
            }
        }
    }
}