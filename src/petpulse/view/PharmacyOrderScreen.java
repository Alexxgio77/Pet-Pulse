public class OrderScreen {
    private ManageOrderClass controller;

    public OrderScreen(ManageOrderClass controller) {
        this.controller = controller;
    }

    public void display() {
        // Εμφανίζει το πλαίσιο καθορισμού της ποσότητας [cite: 148]
    }

    public void checkOrderQuantity(int quantity) {
        controller.order(quantity);
    }
}