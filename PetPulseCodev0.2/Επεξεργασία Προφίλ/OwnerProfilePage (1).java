import java.util.Scanner;

public class OwnerProfilePage {
    private ProfileManager manager;

    public OwnerProfilePage(ProfileManager m) { 
        this.manager = m; 
    }

    public void display(String currentName, String currentPhone, String currentEmail) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- ΠΡΟΦΙΛ ΙΔΙΟΚΤΗΤΗ ---");
        System.out.println("Τρέχοντα Στοιχεία:");
        System.out.println("1. Όνομα: " + currentName);
        System.out.println("2. Τηλέφωνο: " + currentPhone);
        System.out.println("3. Email: " + currentEmail);
        System.out.println("-----------------------");

        System.out.print("Νέο όνομα (πατήστε Enter για παράκαμψη): ");
        String name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            name = currentName;
        }

        System.out.print("Νέο τηλέφωνο (πατήστε Enter για παράκαμψη): ");
        String phone = scanner.nextLine();
        if (phone.trim().isEmpty()) {
            phone = currentPhone;
        }

        System.out.print("Νέο email (πατήστε Enter για παράκαμψη): ");
        String email = scanner.nextLine();
        if (email.trim().isEmpty()) {
            email = currentEmail;
        }

        ValidationClass val = new ValidationClass();
        boolean isValid = val.validateData(name) && val.validateData(phone) && val.validateData(email);

        manager.onDataValidated(isValid, name, phone, email);
    }
}