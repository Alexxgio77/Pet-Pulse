public class DrugManager {
    private DBManager dbManager = new DBManager();

    // Το σύστημα ανακτά τη λίστα με τα φάρμακα και τη διαθεσιμότητά τους [cite: 112]
    public void getAvailableDrugs() {
        String drugsData = dbManager.fetchDrugs();
        
        // Δημιουργία και εμφάνιση της οθόνης φαρμάκων [cite: 112]
        DrugScreen drugScreen = new DrugScreen();
        drugScreen.display(drugsData);
    }
}