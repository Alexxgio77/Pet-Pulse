public class ProfileManager {

    public void retrieveProfileData() {
        new OwnerProfilePage(this).display(DBManager.ownerName, DBManager.ownerPhone, DBManager.ownerEmail);
    }

    public void onDataValidated(boolean isValid, String newName, String newPhone, String newEmail) {
        if (isValid) {
            DBManager.ownerName = newName;
            DBManager.ownerPhone = newPhone;
            DBManager.ownerEmail = newEmail;
            System.out.println("\n✔ Το προφίλ ενημερώθηκε με επιτυχία.");
        } else {
            System.out.println("\n❌ Παρουσιάστηκε σφάλμα κατά την επεξεργασία των στοιχείων.");
        }
        new HomeScreen().display();
    }
    
    public void retrieveVetProfileData() { 
        new VetProfilePage(this).displayVetForm(DBManager.vetBio); 
    }
    
    public void onVetDataValidated(boolean isValid, String newVetData) {
        if (isValid) {
            DBManager.vetBio = newVetData;
            System.out.println("\n✔ Το βιογραφικό ενημερώθηκε με επιτυχία.");
        }
        new HomeScreen().display();
    }
}