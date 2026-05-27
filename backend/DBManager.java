public class DBManager {

    public String fetchProfile() {
        // SQL query για τράβηγμα στοιχείων (όνομα, τηλέφωνο, email κλπ) [cite: 64, 74]
        return "current_profile_data"; [cite: 74]
    }

    public String saveChanges(String data) {
        // SQL query για update των στοιχείων στο database [cite: 71, 74]
        return "statusOk"; [cite: 74]
    }
}