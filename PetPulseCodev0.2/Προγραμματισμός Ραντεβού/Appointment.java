public class Appointment {
    private String dateTime;
    private Pet pet;
    private String status;

    public Appointment(String dateTime, Pet pet) {
        this.dateTime = dateTime;
        this.pet = pet;
        this.status = "Προγραμματισμένο";
    }
    public String getDateTime() { return dateTime; }
    public Pet getPet() { return pet; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}