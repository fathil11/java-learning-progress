import java.util.Scanner;

public class Main {
    public static Bank bank;
    public static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        bank = new Bank("BCA");

        boolean exit = false;
        printMenu();

        while (!exit) {
            int option;
            System.out.print("\nSelect option : ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    printBranch();
                    break;
                case 3:
                    printCustomer();
                    break;
                case 4:
                    printCustomerTransaction();
                    break;
                case 5:
                    addBranch();
                    break;
                case 6:
                    addCustomer();
                    break;
                case 7:
                    addCustomerTransaction();
                    break;
                case 8:
                    updateBranchName();
                    break;
                case 9:
                    updateCustomerName();
                    break;
                case 10:
                    removeBranch();
                    break;
                case 11:
                    removeCustomer();
                    break;
                case 12:
                    exit = true;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("-- Bank " + bank.getName() + " --");
        System.out.println("1. Print menu");
        System.out.println("2. Print Branch");
        System.out.println("3. Print Customer");
        System.out.println("4. Print Customer Transaction");
        System.out.println("5. Add Branch");
        System.out.println("6. Add Customer");
        System.out.println("7. Add Customer Transaction");
        System.out.println("8. Update Branch name");
        System.out.println("9. Update Customer name");
        System.out.println("10. Delete Branch");
        System.out.println("11. Delete Customer");
        System.out.println("12. Exit");
    }

    public static void printBranch() {
        bank.printBranches();
    }

    public static void printCustomer() {
        Branch branch = getBranch();
        if (branch != null) {
            branch.printCustomers();
        }
    }

    public static void printCustomerTransaction() {
        Branch branch = getBranch();
        if (branch != null) {
            Customer customer = getCustomer(branch);

            if (customer != null) {
                customer.printTransaction();
            }
        }
    }

    public static void addBranch() {
        String branchName;
        System.out.print("Input branch name :");
        branchName = scanner.nextLine();

        if (bank.addBranch(branchName)) {
            System.out.println("Branch added successfully");
        }
    }

    public static void addCustomer() {
        Branch branch = getBranch();
        if (branch != null) {
            System.out.print("Input customer name : ");
            String customerName = scanner.nextLine();
            System.out.print("Input customer first transaction : ");
            double customerFirstTransaction = scanner.nextDouble();
            scanner.nextLine();
            if (branch.addCustomer(customerName, customerFirstTransaction)) {
                System.out.println("Customer added successfully");
            }
        }
    }

    public static void addCustomerTransaction() {
        Branch branch = getBranch();
        if (branch != null) {
            if (branch.printCustomers()) {
                Customer customer = getCustomer(branch);
                if (customer != null) {
                    System.out.print("Input customer transaction : ");
                    double transaction = scanner.nextDouble();
                    scanner.nextLine();

                    customer.addTransaction(transaction);
                    System.out.println("Transaction added successfully");
                }
            }
        }
    }

    public static void updateBranchName() {
        Branch branch = getBranch();
        if (branch != null) {
            System.out.print("Input new branch name : ");
            String newBranchName = scanner.nextLine();
            branch.setName(newBranchName);
            System.out.println("Branch name updated successfully");
        }
    }

    public static void updateCustomerName() {
        Branch branch = getBranch();
        if (branch != null) {
            Customer customer = getCustomer(branch);
            if (customer != null) {
                System.out.print("Input customer new name : ");
                String newCustomerName = scanner.nextLine();
                customer.setName(newCustomerName);
                System.out.println("Customer name updated successfully");
            }
        }
    }

    public static void removeBranch() {
        if (bank.printBranches()) {
            System.out.print("Input branch position : ");
            int branchPosition = scanner.nextInt();
            bank.removeBranch(branchPosition - 1);
        }
    }

    public static void removeCustomer() {
        Branch branch = getBranch();
        if (branch != null) {
            if (branch.printCustomers()) {
                System.out.print("Input customer position : ");
                int customerPosition = scanner.nextInt();
                scanner.nextLine();
                branch.removeCustomer(customerPosition);
            }
        }
    }

    private static Branch getBranch() {
        if (bank.printBranches()) {
            int branchPosition;

            System.out.print("Input branch position : ");
            branchPosition = scanner.nextInt();
            scanner.nextLine();

            Branch branch = bank.getBranch(branchPosition - 1);
            return branch;
        }
        return null;
    }

    private static Customer getCustomer(Branch branch) {
        int customerPosition;
        if (branch.printCustomers()) {
            System.out.print("Input customer position : ");
            customerPosition = scanner.nextInt();
            scanner.nextLine();

            Customer customer = branch.getCustomer(customerPosition - 1);
            return customer;
        }
        return null;
    }


}
