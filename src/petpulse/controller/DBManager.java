public class DBManager {

    public String fetchProfile() {
        // SQL query για τράβηγμα στοιχείων (όνομα, τηλέφωνο, email κλπ) 
        return "current_profile_data"; [cite: 74]
    }

    public String saveChanges(String data) {
        // SQL query για update των στοιχείων στο database 
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
        // SQL query για αποθήκευση και σύνδεση με το προφίλ του ιδιοκτήτη 
    }
    public String fetchDrugs() {
        // Ανάκτηση του γενικού καταλόγου φαρμάκων που προμηθεύεται η κλινική 
        return "general_clinic_drugs_catalog";
    }

    public String saveOrderRequest(String drugId, int quantity) {
        // Το σύστημα στέλνει την αίτηση στο προφίλ της γραμματείας 
        System.out.println("Αποθήκευση αίτησης: " + quantity + " τεμάχια για το φάρμακο " + drugId);
        return "statusOk";
    }
        public String fetchVetProfile() {
        // SQL query για τράβηγμα στοιχείων κτηνιάτρου
        return "current_vet_profile_data";
    }

    public void saveVetChanges(String data) {
        // SQL update για αποθήκευση αλλαγών κτηνιάτρου [cite: 99]
        System.out.println("Οι αλλαγές του κτηνιάτρου αποθηκεύτηκαν στη βάση");
    }

}
