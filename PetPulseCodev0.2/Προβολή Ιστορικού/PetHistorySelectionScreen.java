import java.util.List;
import java.util.Scanner;

public class PetHistorySelectionScreen {
    public void display(List<Pet> pets) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΕΠΙΛΟΓΗ ΖΩΟΥ ΓΙΑ ΙΣΤΟΡΙΚΟ ---");
        for (int i = 0; i < pets.size(); i++) System.out.println((i+1) + ". " + pets.get(i).getName());
        System.out.print("Επιλογή: ");
        int choice = scanner.nextInt() - 1;
        if(choice >= 0 && choice < pets.size()) {
            new AppointmentsManager().getAppointments(pets.get(choice).getName());
        }
        new HomeScreen().display();
    }
}