public class ManagedDrugsClass {
    private DBManager dbManager = new DBManager();
    private PharmacyScreen pharmacyScreen;

    public void init() {
        pharmacyScreen = new PharmacyScreen(this);
        pharmacyScreen.display();
    }

    public void searchDrugs(String drugId) {
        // Το σύστημα ανακτά τις πληροφορίες του φαρμάκου από τη βάση [cite: 146]
        String drugDetails = dbManager.queryDrugs(drugId);
        
        // Δημιουργείται η οθόνη λεπτομερειών του φαρμάκου
        DrugsScreen drugsScreen = new DrugsScreen(this);
        drugsScreen.showDrugDetails(drugDetails);
    }

    // Ο χρήστης επιλέγει «Παραγγελία» από το αναδυόμενο παράθυρο [cite: 147]
    public void clickOrder() {
        ManageOrderClass orderController = new ManageOrderClass();
        orderController.init();
    }
}