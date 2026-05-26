import java.util.ArrayList;
import java.util.List;

public class Owner {
    // Στοιχεία προφίλ (σύμφωνα με το Use Case "Επεξεργασία Προφίλ")
    private String fullName;
    private String phoneNumber;
    private String email;
    private String password;
    private String address;
    private List<Pet> pets; 

    public Owner(String fullName, String phoneNumber, String email, String password, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.address = address;
        this.pets = new ArrayList<>(); 
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    // Getters & Setters για να παίζει σωστά η επεξεργασία στοιχείων
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public List<Pet> getPets() { return pets; }
}