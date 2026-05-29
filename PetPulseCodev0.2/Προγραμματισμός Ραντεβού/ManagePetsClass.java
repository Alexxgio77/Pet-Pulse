public class ManagePetsClass {
    public void init() {
        OwnerPetsSelectionScreen petsScreen = new OwnerPetsSelectionScreen();
        petsScreen.display(new DBManager().fetchPets());
    }
}