import java.util.Scanner;

public class ProgramPage {
    private ProgramManager manager;
    public ProgramPage(ProgramManager m) { this.manager = m; }

    public void display(String data) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΔΙΑΧΕΙΡΙΣΗ ΩΡΑΡΙΟΥ ---\nΠρόγραμμα: " + data);
        System.out.print("1. Ανάθεση βάρδιας, 2. Οριστικοποίηση: ");
        if (scanner.nextInt() == 1) {
            new VetManager().getVets(this);
        } else {
            scanner.nextLine();
            System.out.print("Γράψτε το τελικό κείμενο προγράμματος: ");
            String prog = scanner.nextLine();
            if (new ValidationClass().validateProgram(prog)) manager.validProgram(prog, this);
            else manager.invalidProgram(this);
        }
    }
    public void errorMessage() { System.out.println("❌ Σφάλμα κανόνων ωραρίου."); }
}