public class UploadManager {
    public void prepConf() { new PrescriptionConfirmationScreen(this).display(); }
    public void confirm() {
        System.out.println("✔ Η ηλεκτρονική συνταγή εκδόθηκε επιτυχώς.");
        new HomeScreen().display();
    }
    public void cancel() { new HomeScreen().display(); }
}