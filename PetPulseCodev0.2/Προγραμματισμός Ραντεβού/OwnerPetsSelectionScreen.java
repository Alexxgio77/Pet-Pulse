import java.util.List;
import java.util.Scanner;

public class OwnerPetsSelectionScreen {
    public void display(List<Pet> myPets) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΟΘΟΝΗ ΕΠΙΛΟΓΗΣ ΚΑΤΟΙΚΙΔΙΟΥ (UC 1) ---");
        for (int i = 0; i < myPets.size(); i++) {
            System.out.println((i + 1) + ". " + myPets.get(i).getName());
        }
        System.out.print("Επιλογή: ");
        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < myPets.size()) {
            new ManageAppointmentsClass().findAvailableAppointments(myPets.get(choice));
        } else {
            new HomeScreen().display();
        }
    }
}