public class Appointment {
    private String dateTime;
    private String status; // "Προγραμματισμένο", "Ακυρωμένο"

    public Appointment(String dateTime) {
        this.dateTime = dateTime;
        this.status = "Προγραμματισμένο";
    }

    public String getDateTime() { return dateTime; }
    public String getStatus() { return status; }
    
    public void setStatus(String status) { 
        this.status = status; 
    }
}