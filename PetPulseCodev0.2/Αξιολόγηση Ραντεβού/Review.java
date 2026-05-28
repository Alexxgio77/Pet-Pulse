public class Review {
    private int rating;
    private String comments;
    private Appointment appointment;

    public Review(int rating, String comments, Appointment appointment) {
        this.rating = rating;
        this.comments = comments;
        this.appointment = appointment;
    }
    public Appointment getAppointment() { return appointment; }
}