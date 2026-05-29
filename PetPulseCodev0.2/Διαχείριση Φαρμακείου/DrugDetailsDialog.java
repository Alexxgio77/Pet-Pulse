import java.util.Scanner;

public class DrugDetailsDialog {
    private ManagedDrugsClass controller;
    public DrugDetailsDialog(ManagedDrugsClass c) { this.controller = c; }

    public void showDrugDetails(String details) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + details);
        System.out.print("Θέλετε να κάνετε παραγγελία; (1=Ναι, 2=Όχι): ");
        if (scanner.nextInt() == 1) controller.clickOrder(); else new HomeScreen().display();
    }
}