public class ProgramManager {
    public void getProgram() {
        new ProgramPage(this).display(new DBManager().retrieveProgram().toString());
    }
    public void tempSave(String vetId, String shiftId) {
        System.out.println("--> Προσωρινή τοποθέτηση: Κτηνίατρος " + vetId + " στη βάρδια " + shiftId);
    }
    public void validProgram(String data, ProgramPage page) {
        new DBManager().updateProgram(data);
        System.out.println("✔ Το πρόγραμμα δημοσιεύθηκε.");
        new HomeScreen().display();
    }
    public void invalidProgram(ProgramPage page) { page.errorMessage(); }
}