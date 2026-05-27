public class OrderManager {
    private DBManager dbManager = new DBManager();

    public void sendOrder(String drugId, int quantity, DrugScreen screen) {
        // Προώθηση της παραγγελίας στη βάση
        String status = dbManager.saveOrderRequest(drugId, quantity); // [cite: 133]
        
        if (status.equals("statusOk")) {
            screen.successMessage(); // [cite: 134]
        }
    }
}