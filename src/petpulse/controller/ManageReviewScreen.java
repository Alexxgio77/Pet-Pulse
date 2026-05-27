public class ManageReviewScreen {
    
    // Το σύστημα ελέγχει αν υπάρχει ήδη αξιολόγηση για το ραντεβού[cite: 45].
    public void checkReviewExistence(Appointment appointment) {
        boolean isReviewed = false; // Ερώτημα στο ReviewDB
        
        if (isReviewed) {
            // Εναλλακτική Ροή 1: Το σύστημα βρίσκει ήδη καταχωρημένη αξιολόγηση[cite: 52].
            // Εμφανίζει μήνυμα και την επιλογή «Επεξεργασία αξιολόγησης»[cite: 53].
            ExistingReviewsScreen existingScreen = new ExistingReviewsScreen(this, appointment);
            existingScreen.display();
        } else {
            // Βασική Ροή: Το σύστημα βλέπει πως δεν υπάρχει ήδη αξιολόγηση[cite: 46].
            ReviewScreen reviewScreen = new ReviewScreen(this, appointment);
            reviewScreen.display();
        }
    }

    // Έλεγχος και αποθήκευση της αξιολόγησης
    public void submitReview(int rating, String comments, Appointment appointment) {
        // Το σύστημα ελέγχει αν η αξιολόγηση είναι έγκυρη[cite: 48].
        boolean isValid = rating >= 1 && rating <= 5; 

        if (!isValid) {
            // Εναλλακτική Ροή 2: Το σύστημα κρίνει την αξιολόγηση μη έγκυρη[cite: 59].
            // Εμφανίζει μήνυμα σφάλματος και επιστρέφει στη φόρμα[cite: 60].
            ErrorScreen errorScreen = new ErrorScreen();
            errorScreen.display();
            
            ReviewScreen reviewScreen = new ReviewScreen(this, appointment);
            reviewScreen.display();
        } else {
            // Το σύστημα αποθηκεύει την αξιολόγηση στο ιστορικό και στο προφίλ του κτηνιάτρου[cite: 49].
            Review newReview = new Review(rating, comments, appointment);
            // Ενημέρωση στα ReviewDB και VetProfileDB
            
            // Εμφανίζει μήνυμα επιβεβαίωσης και επιστρέφει στη λίστα[cite: 50].
            System.out.println("Η αξιολόγηση καταχωρήθηκε επιτυχώς");
            ManageAppointmentsClass appointmentsController = new ManageAppointmentsClass();
            appointmentsController.showMyAppointments();
        }
    }
}