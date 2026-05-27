public class Drug {
    private String name;
    private int stock;
    private String expirationDate;

    public Drug(String name, int stock, String expirationDate) {
        this.name = name;
        this.stock = stock;
        this.expirationDate = expirationDate;
    }

    // έλεγχος διαθεσιμότητας για το use case της συνταγογράφησης
    public boolean isAvailable(int requestedQuantity) {
        return this.stock >= requestedQuantity;
    }

    public String getName() { return name; }
    
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public String getExpirationDate() { return expirationDate; }
}