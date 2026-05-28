import java.util.List;

public class DrugManager {
    public void getAvailableDrugs() {
        new PrescriptionDrugSelectionScreen().display(new DBManager().fetchDrugs());
    }
    public void init() {
        new DrugOrderRequestScreen(this).display("Γενικός Κατάλογος Φαρμάκων");
    }
    public void makeOrder(String drugId, int quantity, DrugOrderRequestScreen screen) {
        new OrderManager().sendOrder(drugId, quantity, screen);
    }
    public void cancel(DrugOrderRequestScreen screen) { new HomeScreen().display(); }
}