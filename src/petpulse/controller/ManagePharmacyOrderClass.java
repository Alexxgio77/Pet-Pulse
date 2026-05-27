public class ManageOrderClass {
    private DBManager dbManager = new DBManager();

    public void init() {
        // Το σύστημα εμφανίζει την οθόνη παραγγελίας [cite: 148]
        OrderScreen orderScreen = new OrderScreen(this);
        orderScreen.display();
    }

    // Ο χρήστης ορίζει την ποσότητα και πατάει επιβεβαίωση [cite: 149]
    public void order(int quantity) {
        // Έλεγχος της ποσότητας τεμαχίων
        System.out.println("Έλεγχος ποσότητας: " + quantity);
        
        // Καταχώρηση των ειδών στη βάση δεδομένων [cite: 150]
        dbManager.addOrderedItems(quantity);
        
        // Δημιουργία του αντικειμένου της παραγγελίας
        Order newOrder = new Order(quantity);
        
        // Εμφάνιση οθόνης επιβεβαίωσης
        ConfirmationScreen confScreen = new ConfirmationScreen();
        confScreen.display();
    }
}