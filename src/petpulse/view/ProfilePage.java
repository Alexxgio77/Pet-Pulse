public class ProfilePage {
    private ProfileManager manager;
    private ValidationClass validator = new ValidationClass(); 

    public ProfilePage(ProfileManager manager) {
        this.manager = manager; 
    }

    public void display(String profileData) {
        // Στήσιμο της φόρμας με τα στοιχεία του χρήστη 
    }

    // Ο χρήστης αλλάζει πεδία και πατάει επιβεβαίωση 
    public void inputChangesAndConfirm(String newData) {
        boolean isValid = validator.validateData(newData); 
        manager.onDataValidated(isValid, newData, this); 
    }

    public void successMessage() {
        // Pop-up επιτυχίας στο UI 
    }

    public void errorMessage() {
        // Εμφάνιση κατάλληλου μηνύματος σφάλματος 
    }
    private ProfileManager manager;
    private ValidationClass validator = new ValidationClass();

    public ProfilePage(ProfileManager manager) {
        this.manager = manager;
    }

    public void displayVetForm(String vetData) {
        // Εμφάνιση φόρμας με βιογραφικό και εξειδίκευση 
    }

    // Ο χρήστης τροποποιεί τα πεδία και πατάει επιβεβαίωση 
    public void inputVetChangesAndConfirm(String newVetData) {
        boolean isValid = validator.validateVetData(newVetData);
        manager.onVetDataValidated(isValid, newVetData, this); 
    }

    public void successMessage() {
        // Pop-up επιτυχίας 
    }

    public void errorMessage() {
        // Μήνυμα σφάλματος για μη έγκυρα δεδομένα [cite: 102]
    }

}
