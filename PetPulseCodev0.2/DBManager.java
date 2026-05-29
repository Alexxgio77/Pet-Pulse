import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static List<Pet> petsTable = new ArrayList<>();
    public static List<Appointment> appointmentsTable = new ArrayList<>();
    public static List<Review> reviewsTable = new ArrayList<>();
    public static List<Drug> drugsTable = new ArrayList<>();
    public static List<String> weeklyProgram = new ArrayList<>();
    public static List<Order> ordersTable = new ArrayList<>();
    
    // ΝΕΑ ΛΙΣΤΑ: Οι διαθέσιμες ώρες για ραντεβού
    public static List<String> availableSlotsTable = new ArrayList<>();

    public static String ownerName = "Γιάννης Παπαδόπουλος";
    public static String ownerPhone = "6912345678";
    public static String vetBio = "Κτηνίατρος με 10 χρόνια εμπειρία στα μικρά ζώα.";

    static {
        petsTable.add(new Pet("Max", "Σκύλος"));
        petsTable.add(new Pet("Luna", "Γάτα"));
        
        appointmentsTable.add(new Appointment("12/06/2026 10:00", petsTable.get(0)));
        appointmentsTable.get(0).setStatus("Ολοκληρωμένο");

        drugsTable.add(new Drug("Paracetamole-Vet", 15, "12/2028"));
        drugsTable.add(new Drug("Amoxicillin", 2, "05/2027"));
        
        weeklyProgram.add("Δευτέρα: Πρωί - Κενό | Απόγευμα - Κενό");

        // Αρχικό γέμισμα των διαθέσιμων ωρών
        availableSlotsTable.add("15/06/2026 09:00");
        availableSlotsTable.add("15/06/2026 11:30");
        availableSlotsTable.add("16/06/2026 14:00");
    }

    public List<Pet> fetchPets() { return petsTable; }
    public void saveAppointment(Appointment app) { appointmentsTable.add(app); }
    public List<Appointment> fetchAppointments() { return appointmentsTable; }
    
    // ΝΕΕΣ ΜΕΘΟΔΟΙ: Ανάκτηση και αφαίρεση ωρών
    public List<String> fetchAvailableSlots() { return availableSlotsTable; }
    public void removeAvailableSlot(String slot) { availableSlotsTable.remove(slot); }

    public boolean hasReview(Appointment app) {
        for (Review r : reviewsTable) {
            if (r.getAppointment() == app) return true;
        }
        return false;
    }
    public void saveReview(Review review) { reviewsTable.add(review); }
    public List<Drug> fetchDrugs() { return drugsTable; }
    
    public String queryDrugs(String drugId) {
        for (Drug d : drugsTable) {
            if (d.getName().equalsIgnoreCase(drugId)) {
                return d.getName() + " (Απόθεμα: " + d.getStock() + ", Λήξη: " + d.getExpirationDate() + ")";
            }
        }
        return "Το φάρμακο δεν βρέθηκε.";
    }
    
    public void addOrderedItems(int quantity) { ordersTable.add(new Order(quantity)); }
    public List<String> retrieveProgram() { return weeklyProgram; }
    public void updateProgram(String fullProgramData) {
        weeklyProgram.clear();
        weeklyProgram.add(fullProgramData);
    }
}