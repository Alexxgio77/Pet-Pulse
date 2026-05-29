public class VetManager {
    public void getVets(ProgramPage programPage) {
        new VetsList(programPage).display("1. Νίκος (Παθολόγος), 2. Μαρία (Χειρουργός)");
    }
}