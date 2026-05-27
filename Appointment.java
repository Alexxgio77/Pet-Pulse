public class Appointment {
    private String date; // Ημερομηνία ραντεβού
    private String time; // Ώρα ραντεβού
    private Pet pet;     // Το κατοικίδιο που θα εξεταστεί (συνδέεται με την κλάση Pet)
    private String status; // Κατάσταση: "Προγραμματισμένο", "Ολοκληρωμένο", "Ακυρωμένο"

    // Constructor: Όταν κλείνεται ένα ραντεβού, ξεκινάει πάντα ως "Προγραμματισμένο"
    public Appointment(String date, String time, Pet pet) {
        this.date = date;
        this.time = time;
        this.pet = pet;
        this.status = "Προγραμματισμένο"; 
    }

    // Getters & Setters
    public String getDate() { return date; }
    public String getTime() { return time; }
    public Pet getPet() { return pet; }
    
    public String getStatus() { return status; }
    
    // Θα μας χρειαστεί για το Use Case "Ακύρωση Ραντεβού" ή όταν τελειώνει η εξέταση
    public void setStatus(String status) { 
        this.status = status; 
    }
}