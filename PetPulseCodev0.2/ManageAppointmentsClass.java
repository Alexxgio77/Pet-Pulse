import java.util.ArrayList;
import java.util.List;

public class ManageAppointmentsClass {
    private DBManager dbManager = new DBManager();
    private Pet selectedPet;
    private Appointment selectedAppointment;

    // UC 1
    public void findAvailableAppointments(Pet pet) {
        this.selectedPet = pet;
        List<String> availableSlots = new ArrayList<>();
        availableSlots.add("15/06/2026 09:00");
        availableSlots.add("15/06/2026 11:30");
        new AvailableSlotsScreen(this).display(availableSlots);
    }
    public void returnSelection(String dateTime) {
        dbManager.saveAppointment(new Appointment(dateTime, selectedPet));
        new AppointmentBookingConfirmationScreen().display();
    }

    // UC 2
    public void showMyAppointments() {
        new ActiveAppointmentsSelectionScreen(this).display(dbManager.fetchAppointments());
    }
    public void returnSelection(Appointment appointment) {
        this.selectedAppointment = appointment;
        new AppointmentCancellationConfirmationScreen(this).display();
    }
    public void confirm() {
        selectedAppointment.setStatus("Ακυρωμένο");
        new HomeScreen().display();
    }
    public void cancel() { new HomeScreen().display(); }

    // UC 3
    public void showAppointmentsForReview() {
        new CompletedAppointmentsSelectionScreen(this).display(dbManager.fetchAppointments());
    }
    public void returnSelectionForReview(Appointment appointment) {
        new ManageReviewScreen().checkReviewExistence(appointment);
    }
}