public class PharmacyScreen {
    private ManagedDrugsClass controller;

    public PharmacyScreen(ManagedDrugsClass controller) {
        this.controller = controller;
    }

    // Εμφανίζει το μενού με τη λίστα φαρμάκων και την μπάρα αναζήτησης [cite: 144]
    public void display() {
        // UI rendering
    }

    // Ο χρήστης κάνει κλικ/επιλέγει ένα φάρμακο [cite: 145]
    public void select(String drugId) {
        controller.searchDrugs(drugId);
    }
}