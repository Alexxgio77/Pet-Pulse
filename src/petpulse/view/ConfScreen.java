public class ConfScreen {
    private UploadManager manager;

    public ConfScreen(UploadManager manager) {
        this.manager = manager;
    }

    public void display() {
        // Το σύστημα ζητάει επιβεβαίωση [cite: 115]
    }

    public void clickConfirm() {
        manager.confirm(); [cite: 116]
    }

    public void clickCancel() {
        manager.cancel(); [cite: 124]
    }
}