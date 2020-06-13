import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone;

    public static void main(String[] args) {
        phone = new MobilePhone();
        boolean start = true;

        seeder();
        printMenu();

        while (start) {
            System.out.print("\nChoose Action : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    printContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    start = false;
                    break;
                default:
                    System.out.println("Action not found !");
                    printMenu();
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Print Menu");
        System.out.println("2. Print Contacts");
        System.out.println("3. Add Contact");
        System.out.println("4. Update Contact");
        System.out.println("5. Delete Contact");
        System.out.println("6. Exit");

    }

    public static void printContacts() {
        System.out.println("--- Contacts List ---");
        phone.printContacts();
    }

    public static void addContact() {
        String name;
        String number;

        System.out.println("--- Add Contact ---");
        System.out.print("Input name : ");
        name = scanner.nextLine();

        System.out.print("Input number : ");
        number = scanner.nextLine();

        Contact newContact = Contact.create(name, number);

        if (phone.addContact(newContact)) {
            System.out.println("Contact added successfully");
        } else {
            System.out.println("Contact already exists !");
        }
    }

    public static void updateContact() {
        String oldName;
        String name;
        String number;

        System.out.println("--- Update Contact ---");
        System.out.print("Input old name : ");
        oldName = scanner.nextLine();

        Contact current = phone.checkContactNameExist(oldName);
        if (current != null) {
            System.out.print("Input name : ");
            name = scanner.nextLine();

            System.out.print("Input number : ");
            number = scanner.nextLine();

            Contact newContact = Contact.create(name, number);
            if(phone.updateContact(current, newContact)){
                System.out.println("Contact updated successfully");
            }else{
                System.out.println("Something wrong !");
            }
        }else{
            System.out.println("Contact not found !");
        }

    }

    public static void removeContact() {
        int position;

        System.out.println("--- Remove Contact ---");
        System.out.print("Input contact position : ");
        position = scanner.nextInt();

        if(phone.removeContact(position)){
            System.out.println("Contact removed successfully");
        }else{
            System.out.println("Contact not found !");
        }

    }

    public static void seeder() {
        phone.addContact(Contact.create("Fathil Arham", "082225210125"));
        phone.addContact(Contact.create("Fikri Azami", "089995768593"));
        phone.addContact(Contact.create("Faid Ahsanandaru", "085556586789"));
        phone.addContact(Contact.create("Zeta", "083334568795"));
    }
}
