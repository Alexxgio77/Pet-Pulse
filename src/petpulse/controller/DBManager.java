public class DBManager {

    public String fetchProfile() {
        // SQL query για τράβηγμα στοιχείων (όνομα, τηλέφωνο, email κλπ) [cite: 64, 74]
        return "current_profile_data"; [cite: 74]
    }

    public String saveChanges(String data) {
        // SQL query για update των στοιχείων στο database [cite: 71, 74]
        return "statusOk"; [cite: 74]

    public String fetchPets(String vetId) {
        return "examined_pets_data";
    }

    public String fetchDrugs() {
        return "clinic_drugs_data";
    }

    public void submitPrescription() {
        // Καταχώρηση συνταγής στη βάση δεδομένων
    }

    public void saveAndSend() {
        // SQL query για αποθήκευση και σύνδεση με το προφίλ του ιδιοκτήτη [cite: 117]
    }
    public String fetchDrugs() {
        // Ανάκτηση του γενικού καταλόγου φαρμάκων που προμηθεύεται η κλινική [cite: 131]
        return "general_clinic_drugs_catalog";
    }

    public String saveOrderRequest(String drugId, int quantity) {
        // Το σύστημα στέλνει την αίτηση στο προφίλ της γραμματείας [cite: 133]
        System.out.println("Αποθήκευση αίτησης: " + quantity + " τεμάχια για το φάρμακο " + drugId);
        return "statusOk";
    }
}
