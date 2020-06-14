import java.util.Scanner;

public class Main {
    private static Bank bank;
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        bank = Bank.create("BCA");
        boolean exit = false;

        printMenu();

        while (!exit) {
            int option;
            System.out.print("\nChoose option : ");
            option = s.nextInt();
            s.nextLine();

            switch (option) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    printBranches();
                    break;
                case 6:
                    printCustomers();
                    break;
                case 7:
                    printCustomersWithDetails();
                    break;
                case 8:

                case 9:
                    exit = true;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("--- " + bank.getName() + " Bank ---");
        System.out.println("1. Print Menu");
        System.out.println("2. Add Branch");
        System.out.println("3. Add Customer");
        System.out.println("4. Add Transaction");
        System.out.println("5. Print Branches");
        System.out.println("6. Print All Customers");
        System.out.println("7. Print All Customers with Details");
        System.out.println("8. Print All Customers from Branch");
        System.out.println("9. Exit");
        System.out.println("--------------------------------------");
    }

    public static void addBranch() {
        String name;
        System.out.print("Input branch name : ");
        name = s.nextLine();

        System.out.println(bank.addBranch(name));
    }

    public static void addCustomer() {
        printBranches();

        int branchPosition;
        System.out.print("Chose branch : ");
        branchPosition = s.nextInt() - 1;
        s.nextLine();

        if (!bank.branchIsExists(branchPosition)) {
            System.out.println("Branch not found !");
            return;
        }

        String name;
        System.out.print("Input customer name : ");
        name = s.nextLine();

        double firstTransaction;
        System.out.print("Input customer first transaction : ");
        firstTransaction = s.nextInt();
        s.nextLine();

        System.out.println(bank.getBranch(branchPosition).addCustomer(name, firstTransaction));
    }

    public static void addTransaction() {
        printBranches();

        int branchPosition;
        System.out.print("Chose branch : ");
        branchPosition = s.nextInt() - 1;
        s.nextLine();

        if (!bank.branchIsExists(branchPosition)) {
            System.out.println("Branch not found !");
            return;
        }

        bank.printCustomerFromBranch(branchPosition);

        int customerPosition;
        System.out.print("Chose customer : ");
        customerPosition = s.nextInt() - 1;
        s.nextLine();

        if (!bank.getBranch(branchPosition).customerIsExists(customerPosition)) {
            System.out.println("Customer not found !");
            return;
        }

        double amount;
        System.out.print("Input customer transaction : ");
        amount = s.nextInt();
        s.nextLine();

        System.out.println(bank.getBranch(branchPosition).getCustomer(customerPosition).addTransaction(amount));
    }

    public static void printBranches() {
        bank.printBranches();
    }

    public static void printCustomers() {
        bank.printCustomers();
    }

    public static void printCustomersWithDetails() {
        bank.printCustomersWithDetail();
    }

    public static void printCustomersFromBranch() {
        printBranches();

        int branchPosition;
        System.out.print("Chose branch : ");
        branchPosition = s.nextInt() - 1;
        s.nextLine();

        if (!bank.branchIsExists(branchPosition)) {
            System.out.println("Branch not found !");
            return;
        }

        bank.printCustomerFromBranch(branchPosition);
    }
}
