public class UploadManager {
    private DBManager dbManager = new DBManager();

    // Προετοιμασία επιβεβαίωσης [cite: 115]
    public void prepConf() {
        ConfScreen confScreen = new ConfScreen(this);
        confScreen.display();
    }

    // Ο χρήστης επιβεβαιώνει την έκδοση [cite: 116]
    public void confirm() {
        dbManager.submitPrescription();
        dbManager.saveAndSend(); // Αποστολή στο προφίλ του ιδιοκτήτη [cite: 117]
        System.out.println("statusOK");
    }

    // Εναλλακτική Ροή 2: Ο χρήστης πατάει «Ακύρωση» [cite: 124]
    public void cancel() {
        DrugScreen drugScreen = new DrugScreen();
        drugScreen.display("refresh_drugs"); // Επιστροφή στη λίστα φαρμάκων [cite: 125]
    }

    // Μετάβαση στο Use Case «Αίτηση Παραγγελίας Φαρμάκου» [cite: 121]
    public void initiateOrderReq() {
        System.out.println("Εκτέλεση UC: Αίτηση Παραγγελίας Φαρμάκου");
    }
}