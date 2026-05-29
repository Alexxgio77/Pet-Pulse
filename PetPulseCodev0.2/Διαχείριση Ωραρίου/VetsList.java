import java.util.Scanner;

public class VetsList {
    private ProgramPage page;
    public VetsList(ProgramPage p) { this.page = p; }

    public void display(String vets) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nΚτηνίατροι: " + vets);
        System.out.print("ID κτηνιάτρου: "); String vId = scanner.next();
        System.out.print("Βάρδια (π.χ. Πρωί): "); String shift = scanner.next();
        new ProgramManager().tempSave(vId, shift);
        page.display("Τροποποιημένο πρόγραμμα");
    }
}