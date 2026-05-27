public class HomeScreen {
    private PetManager petManager = new PetManager();

    // Ο κτηνίατρος κάνει κλικ στην επιλογή «Έκδοση Συνταγής» [cite: 109]
    public void clickPrescription() {
        petManager.getExaminedPets();
    }
}