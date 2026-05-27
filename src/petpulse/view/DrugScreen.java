public class DrugScreen {

    public void display(String drugsData) {
        // Εμφάνιση της λίστας φαρμάκων στο UI 
    }

    // Ο κτηνίατρος επιλέγει φάρμακο, ποσότητα και εισάγει οδηγίες 
    public void selectDrug(String details) {
        UploadManager uploadManager = new UploadManager();
        uploadManager.prepConf();
    }

    // Εναλλακτική Ροή 1: Το φάρμακο είναι εκτός διαθεσιμότητας 
    public void clickRequestOrder() {
        UploadManager uploadManager = new UploadManager();
        uploadManager.initiateOrderReq();
    }
    
    private DrugManager manager;

    public DrugScreen(DrugManager manager) {
        this.manager = manager;
    }

    // Το σύστημα εμφανίζει τη λίστα με τον γενικό κατάλογο των φαρμάκων 
    public void display(String catalogData) {
        // UI rendering του καταλόγου
    }

    // Ο χρήστης επιλέγει το φάρμακο, την ποσότητα και πατάει αποστολή 
    public void selectDrugAndQuant(String drugId, int quantity) {
        manager.makeOrder(drugId, quantity, this);
    }

    // Εναλλακτική Ροή 1: Ο χρήστης πατάει ακύρωση 
    public void clickCancel() {
        manager.cancel(this);
    }

    // Το σύστημα εμφανίζει μήνυμα επιτυχούς αποστολής [cite: 134]
    public void successMessage() {
        System.out.println("Η αίτηση παραγγελίας στάλθηκε επιτυχώς στη γραμματεία.");
    }
}
