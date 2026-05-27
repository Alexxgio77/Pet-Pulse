public class DrugsScreen {
    private ManagedDrugsClass controller;

    public DrugsScreen(ManagedDrugsClass controller) {
        this.controller = controller;
    }

    // Εμφανίζει το αναδυόμενο παράθυρο με τις πληροφορίες του φαρμάκου [cite: 146]
    public void showDrugDetails(String details) {
        // UI rendering
    }

    public void handleOrderClick() {
        controller.clickOrder();
    }
}