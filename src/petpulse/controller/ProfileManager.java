public class ProfileManager {
    private DBManager dbManager = new DBManager(); 

    // Ανάκτηση τρεχόντων στοιχείων από τη βάση 
    public void retrieveProfileData() {
        String profileData = dbManager.fetchProfile(); 
        
        // Δημιουργία και εμφάνιση της φόρμας επεξεργασίας 
        ProfilePage profilePage = new ProfilePage(this); 
        profilePage.display(profileData); 
    }

    // Καλείται από το alt block μετά τον έλεγχο εγκυρότητας 
    public void onDataValidated(boolean isValid, String newData, ProfilePage page) {
        if (isValid) { 
            // Αν είναι σωστά, αποθηκεύει και βγάζει μήνυμα επιτυχίας 
            String status = dbManager.saveChanges(newData); 
            page.successMessage(); 
            System.out.println("Επιτυχής Αποθήκευση Αλλαγών"); 
        } else { [cite: 74]
            // Αν εντοπίσει λάθος, επιστρέφει σφάλμα στην οθόνη 
            page.errorMessage(); 
        }
    }
      } private DBManager dbManager = new DBManager();

    // Ανάκτηση στοιχείων κτηνιάτρου (βιογραφικό, τηλέφωνο, email, εξειδίκευση) 
    public void retrieveVetProfileData() {
        String vetData = dbManager.fetchVetProfile();
        
        ProfilePage profilePage = new ProfilePage(this);
        profilePage.displayVetForm(vetData);
    }

    public void onVetDataValidated(boolean isValid, String newVetData, ProfilePage page) {
        if (isValid) {
            dbManager.saveVetChanges(newVetData);
            page.successMessage();
            System.out.println("Επιτυχής Αποθήκευση Αλλαγών"); // 
        } else {
            page.errorMessage(); // 
    }
}
