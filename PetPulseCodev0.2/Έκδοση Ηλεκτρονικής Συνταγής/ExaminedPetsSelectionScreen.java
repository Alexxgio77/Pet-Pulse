import java.util.List;
import java.util.Scanner;

public class ExaminedPetsSelectionScreen {
    public void display(List<Pet> pets) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΕΚΔΟΣΗ ΣΥΝΤΑΓΗΣ: ΕΠΙΛΟΓΗ ΖΩΟΥ ---");
        for (int i = 0; i < pets.size(); i++) System.out.println((i+1) + ". " + pets.get(i).getName());
        System.out.print("Επιλογή: ");
        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < pets.size()) new DrugManager().getAvailableDrugs();
        else new HomeScreen().display();
    }
}