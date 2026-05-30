public class PetManager {
    public void getPets() {
        new PetHistorySelectionScreen().display(new DBManager().fetchPets());
    }
    public void getExaminedPets() {
        new ExaminedPetsSelectionScreen().display(new DBManager().fetchPets());
    }
}