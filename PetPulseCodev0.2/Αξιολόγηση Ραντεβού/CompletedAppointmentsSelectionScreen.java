import java.util.List;
import java.util.Scanner;

public class CompletedAppointmentsSelectionScreen {
    private ManageAppointmentsClass controller;
    public CompletedAppointmentsSelectionScreen(ManageAppointmentsClass c) { this.controller = c; }

    public void display(List<Appointment> appointments) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΟΘΟΝΗ ΟΛΟΚΛΗΡΩΜΕΝΩΝ ΡΑΝΤΕΒΟΥ (UC 3) ---");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println((i + 1) + ". " + appointments.get(i).getDateTime() + " - " + appointments.get(i).getPet().getName());
        }
        System.out.print("Επιλέξτε ραντεβού: ");
        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < appointments.size()) {
            controller.returnSelectionForReview(appointments.get(choice));
        } else {
            new HomeScreen().display();
        }
    }
}