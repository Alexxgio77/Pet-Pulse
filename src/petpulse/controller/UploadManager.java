public class UploadManager {
    private DBManager dbManager = new DBManager();

    // Προετοιμασία επιβεβαίωσης 
    public void prepConf() {
        ConfScreen confScreen = new ConfScreen(this);
        confScreen.display();
    }

    // Ο χρήστης επιβεβαιώνει την έκδοση 
    public void confirm() {
        dbManager.submitPrescription();
        dbManager.saveAndSend(); // Αποστολή στο προφίλ του ιδιοκτήτη 
        System.out.println("statusOK");
    }

    // Εναλλακτική Ροή 2: Ο χρήστης πατάει «Ακύρωση» 
    public void cancel() {
        DrugScreen drugScreen = new DrugScreen();
        drugScreen.display("refresh_drugs"); // Επιστροφή στη λίστα φαρμάκων 
    }

    // Μετάβαση στο Use Case «Αίτηση Παραγγελίας Φαρμάκου» 
    public void initiateOrderReq() {
        System.out.println("Εκτέλεση UC: Αίτηση Παραγγελίας Φαρμάκου");
    }
}
