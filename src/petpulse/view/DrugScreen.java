public class DrugScreen {

    public void display(String drugsData) {
        // Εμφάνιση της λίστας φαρμάκων στο UI [cite: 112]
    }

    // Ο κτηνίατρος επιλέγει φάρμακο, ποσότητα και εισάγει οδηγίες [cite: 113, 114]
    public void selectDrug(String details) {
        UploadManager uploadManager = new UploadManager();
        uploadManager.prepConf();
    }

    // Εναλλακτική Ροή 1: Το φάρμακο είναι εκτός διαθεσιμότητας [cite: 119]
    public void clickRequestOrder() {
        UploadManager uploadManager = new UploadManager();
        uploadManager.initiateOrderReq();
    }
}