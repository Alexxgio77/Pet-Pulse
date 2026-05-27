public class HomeScreen {
    private ProfileManager profileManager = new ProfileManager();

    // Ο χρήστης επιλέγει την «Επεξεργασία Προφίλ» από το μενού [cite: 67, 74]
    public void clickEditProfile() {
        profileManager.retrieveProfileData(); [cite: 74]
    }
}