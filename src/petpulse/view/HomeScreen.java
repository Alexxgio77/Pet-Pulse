public class HomeScreen {
    private PetManager petManager = new PetManager();

    // Ο κτηνίατρος κάνει κλικ στην επιλογή «Έκδοση Συνταγής» [cite: 109]
    public void clickPrescription() {
        petManager.getExaminedPets();
    }
    private ProfileManager profileManager = new ProfileManager();

    // Ο χρήστης επιλέγει την «Επεξεργασία Προφίλ» από το μενού [cite: 67, 74]
    public void clickEditProfile() {
        profileManager.retrieveProfileData(); [cite: 74]
    }

}
