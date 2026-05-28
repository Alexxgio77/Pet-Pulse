public class ProfileManager {
    private DBManager dbManager = new DBManager();

    public void retrieveProfileData() {
        new OwnerProfilePage(this).display(DBManager.ownerName);
    }
    public void onDataValidated(boolean isValid, String newData) {
        if (isValid) DBManager.ownerName = newData;
        new HomeScreen().display();
    }
    
    // (Το Μέρος 2 του ProfileManager βρίσκεται στο UC 7)
    public void retrieveVetProfileData() { new VetProfilePage(this).displayVetForm(DBManager.vetBio); }
    public void onVetDataValidated(boolean isValid, String newVetData) {
        if (isValid) DBManager.vetBio = newVetData;
        new HomeScreen().display();
    }
}