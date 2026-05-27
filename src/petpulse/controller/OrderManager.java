public class OrderManager {
    private DBManager dbManager = new DBManager();

    public void sendOrder(String drugId, int quantity, DrugScreen screen) {
        // Προώθηση της παραγγελίας στη βάση
        String status = dbManager.saveOrderRequest(drugId, quantity); 
        
        if (status.equals("statusOk")) {
            screen.successMessage(); 
        }
    }
}
