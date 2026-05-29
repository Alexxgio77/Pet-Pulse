public class ManagedDrugsClass {
    public void init() { new PharmacyScreen(this).display(); }
    public void searchDrugs(String drugId) {
        new DrugDetailsDialog(this).showDrugDetails(new DBManager().queryDrugs(drugId));
    }
    public void clickOrder() { new ManageOrderClass().init(); }
}