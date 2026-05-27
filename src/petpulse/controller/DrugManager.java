public class DrugManager {
    private DBManager dbManager = new DBManager();

    // Το σύστημα ανακτά τη λίστα με τα φάρμακα και τη διαθεσιμότητά τους 
    public void getAvailableDrugs() {
        String drugsData = dbManager.fetchDrugs();
        
        // Δημιουργία και εμφάνιση της οθόνης φαρμάκων 
        DrugScreen drugScreen = new DrugScreen();
        drugScreen.display(drugsData);
    }

    private OrderManager orderManager = new OrderManager();

    public void init() {
        String drugsData = dbManager.fetchDrugs();
        DrugScreen drugScreen = new DrugScreen(this);
        drugScreen.display(drugsData); // 
    }

    public void makeOrder(String drugId, int quantity, DrugScreen screen) {
        orderManager.sendOrder(drugId, quantity, screen);
    }

    public void cancel(DrugScreen screen) {
        // Το σύστημα ακυρώνει τη διαδικασία και επιστρέφει τον χρήστη στην οθόνη των φαρμάκων [cite: 137]
        System.out.println("Η διαδικασία ακυρώθηκε.");
    }
}
