import java.util.ArrayList;
import java.util.List;

public class DBManager {
    // Οι "πίνακες" της βάσης δεδομένων στη μνήμη
    private static List<Pet> petsTable = new ArrayList<>();
    private static List<Appointment> appointmentsTable = new ArrayList<>();
    private static List<Review> reviewsTable = new ArrayList<>();
    private static List<Drug> drugsTable = new ArrayList<>();
    private static List<String> weeklyProgram = new ArrayList<>();
    
    // Στοιχεία προφίλ
    public static String ownerName = "Γιάννης Παπαδόπουλος";
    public static String ownerPhone = "6912345678";
    public static String vetBio = "Κτηνίατρος με 10 χρόνια εμπειρία στα μικρά ζώα.";

    static {
        // Αρχικά δεδομένα
        petsTable.add(new Pet("Max", "Σκύλος"));
        petsTable.add(new Pet("Luna", "Γάτα"));
        
        drugsTable.add(new Drug("Paracetamole-Vet", 15, "12/2028"));
        drugsTable.add(new Drug("Amoxicillin", 2, "05/2027")); // Λίγο απόθεμα
        drugsTable.add(new Drug("Vitamin-Complex", 0, "09/2026")); // Εξαντλημένο
        
        weeklyProgram.add("Δευτέρα: Πρωί - Κενό | Απόγευμα - Κενό");
        weeklyProgram.add("Τρίτη: Πρωί - Κενό | Απόγευμα - Κενό");
    }

    // Μέθοδοι για Κατοικίδια & Ραντεβού
    public List<Pet> fetchPets() { return petsTable; }
    
    public void saveAppointment(Appointment app) { appointmentsTable.add(app); }
    
    public List<Appointment> fetchAppointments() { return appointmentsTable; }

    // Μέθοδοι για Αξιολογήσεις
    public void saveReview(Review review) { reviewsTable.add(review); }
    public List<Review> fetchReviews() { return reviewsTable; }

    // Μέθοδοι για Φάρμακα
    public List<Drug> fetchDrugs() { return drugsTable; }
    public void addDrugStock(String name, int qty) {
        for (Drug d : drugsTable) {
            if (d.getName().equalsIgnoreCase(name)) {
                d.setStock(d.getStock() + qty);
                return;
            }
        }
        drugsTable.add(new Drug(name, qty, "12/2029")); // Αν δεν υπάρχει, το φτιάχνει
    }

    // Μέθοδοι για Ωράριο
    public List<String> fetchProgram() { return weeklyProgram; }
    public void updateProgram(int dayIndex, String details) {
        if (dayIndex >= 0 && dayIndex < weeklyProgram.size()) {
            weeklyProgram.set(dayIndex, details);
        }
    }
}