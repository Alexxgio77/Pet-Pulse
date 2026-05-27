public class ConfScreen {
    private UploadManager manager;

    public ConfScreen(UploadManager manager) {
        this.manager = manager;
    }

    public void display() {
        // Το σύστημα ζητάει επιβεβαίωση 
    }

    public void clickConfirm() {
        manager.confirm(); 
    }

    public void clickCancel() {
        manager.cancel(); 
    }
}
