import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species; // π.χ. σκύλος, γάτα κλπ.
    private List<String> medicalHistory; // εμβόλια, ιστορικό παθήσεων

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        this.medicalHistory = new ArrayList<>(); // ξεκινάει πάντα άδειο
    }

    // Καλείται από το backend όταν ο κτηνίατρος γράφει νέα διάγνωση/εμβόλιο
    public void addMedicalRecord(String record) {
        this.medicalHistory.add(record);
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public List<String> getMedicalHistory() { return medicalHistory; }
}