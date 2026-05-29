import java.util.List;
import java.util.Scanner;

public class ActiveAppointmentsSelectionScreen {
    private ManageAppointmentsClass controller;

    public ActiveAppointmentsSelectionScreen(ManageAppointmentsClass c) { 
        this.controller = c; 
    }

    public void display(List<Appointment> apps) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΟΘΟΝΗ ΕΝΕΡΓΩΝ ΡΑΝΤΕΒΟΥ ---");
        
        if(apps.isEmpty()) { 
            System.out.println("Δεν υπάρχουν εκκρεμή ραντεβού."); 
            new HomeScreen().display(); 
            return; 
        }
        
        for (int i = 0; i < apps.size(); i++) {
            System.out.println((i + 1) + ". " + apps.get(i).getDateTime() + " | Ζώο: " + apps.get(i).getPet().getName());
        }
        
        System.out.print("Επιλέξτε ραντεβού για ακύρωση: ");
        int choice = scanner.nextInt() - 1;
        
        if (choice >= 0 && choice < apps.size()) {
            controller.returnSelection(apps.get(choice));
        } else {
            new HomeScreen().display();
        }
    }
}