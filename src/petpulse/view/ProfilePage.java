public class ProfilePage {
    private ProfileManager manager;
    private ValidationClass validator = new ValidationClass(); [cite: 74]

    public ProfilePage(ProfileManager manager) {
        this.manager = manager; [cite: 74]
    }

    public void display(String profileData) {
        // Στήσιμο της φόρμας με τα στοιχεία του χρήστη [cite: 68, 74]
    }

    // Ο χρήστης αλλάζει πεδία και πατάει επιβεβαίωση [cite: 69, 74]
    public void inputChangesAndConfirm(String newData) {
        boolean isValid = validator.validateData(newData); [cite: 70, 74]
        manager.onDataValidated(isValid, newData, this); [cite: 74]
    }

    public void successMessage() {
        // Pop-up επιτυχίας στο UI [cite: 71, 74]
    }

    public void errorMessage() {
        // Εμφάνιση κατάλληλου μηνύματος σφάλματος [cite: 73, 74]
    }
    private ProfileManager manager;
    private ValidationClass validator = new ValidationClass();

    public ProfilePage(ProfileManager manager) {
        this.manager = manager;
    }

    public void displayVetForm(String vetData) {
        // Εμφάνιση φόρμας με βιογραφικό και εξειδίκευση [cite: 92, 96]
    }

    // Ο χρήστης τροποποιεί τα πεδία και πατάει επιβεβαίωση [cite: 97]
    public void inputVetChangesAndConfirm(String newVetData) {
        boolean isValid = validator.validateVetData(newVetData);
        manager.onVetDataValidated(isValid, newVetData, this); // [cite: 98]
    }

    public void successMessage() {
        // Pop-up επιτυχίας [cite: 99]
    }

    public void errorMessage() {
        // Μήνυμα σφάλματος για μη έγκυρα δεδομένα [cite: 102]
    }

}
