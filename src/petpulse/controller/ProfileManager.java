public class ProfileManager {
    private DBManager dbManager = new DBManager(); [cite: 74]

    // Ανάκτηση τρεχόντων στοιχείων από τη βάση [cite: 68, 74]
    public void retrieveProfileData() {
        String profileData = dbManager.fetchProfile(); [cite: 74]
        
        // Δημιουργία και εμφάνιση της φόρμας επεξεργασίας [cite: 68, 74]
        ProfilePage profilePage = new ProfilePage(this); [cite: 74]
        profilePage.display(profileData); [cite: 74]
    }

    // Καλείται από το alt block μετά τον έλεγχο εγκυρότητας [cite: 70, 74]
    public void onDataValidated(boolean isValid, String newData, ProfilePage page) {
        if (isValid) { [cite: 74]
            // Αν είναι σωστά, αποθηκεύει και βγάζει μήνυμα επιτυχίας [cite: 71, 74]
            String status = dbManager.saveChanges(newData); [cite: 74]
            page.successMessage(); [cite: 74]
            System.out.println("Επιτυχής Αποθήκευση Αλλαγών"); [cite: 71]
        } else { [cite: 74]
            // Αν εντοπίσει λάθος, επιστρέφει σφάλμα στην οθόνη [cite: 73, 74]
            page.errorMessage(); [cite: 74]
        }
    }
}