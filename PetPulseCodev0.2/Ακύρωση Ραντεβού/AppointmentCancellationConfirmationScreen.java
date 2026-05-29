import java.util.Scanner;

public class AppointmentCancellationConfirmationScreen {
    private ManageAppointmentsClass controller;
    public AppointmentCancellationConfirmationScreen(ManageAppointmentsClass c) { this.controller = c; }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nΕπιβεβαίωση ακύρωσης; (1=Ναι, 2=Όχι): ");
        if (scanner.nextInt() == 1) controller.confirm(); else controller.cancel();
    }
}