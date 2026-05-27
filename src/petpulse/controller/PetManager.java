public class PetManager {
    private DBManager dbManager = new DBManager();

    // Το σύστημα ανακτά τα κατοικίδια που έχει εξετάσει ο κτηνίατρος [
    public void getExaminedPets() {
        String vetId = "vet_123";
        String petsData = dbManager.fetchPets(vetId);
        
        // Δημιουργία και εμφάνιση της οθόνης επιλογής κατοικιδίου 
        PetScreen petScreen = new PetScreen();
        petScreen.display(petsData);
    }
}
