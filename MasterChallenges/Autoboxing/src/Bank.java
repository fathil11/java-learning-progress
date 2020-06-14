import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public static Bank create(String name) {
        return new Bank(name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public Branch getBranch(int i) {
        return branches.get(i);
    }

    public String addBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.getBranch(i).getName().equals(name)) {
                return "Branch already exists !";
            }
        }

        if (this.branches.add(Branch.create(name))) {
            return "Success";
        }

        return "Something wrong when adding branch !";
    }

    public void printBranches() {
        for (int i = 0; i < this.branches.size(); i++) {
            System.out.println((i + 1) + ". " + this.getBranch(i).getName());
        }
    }

    public boolean branchIsExists(int position) {
        return position < this.branches.size();
    }

    public void printCustomers() {
        for (int i = 0; i < this.branches.size(); i++) {
            System.out.println("--- " + this.getBranch(i).getName() + " ---");
            for (int j = 0; j < this.getBranch(i).getCustomers().size(); j++) {
                System.out.println((j + 1) + ". " + this.getBranch(i).getCustomer(j).getName());
            }
        }
    }

    public void printCustomersWithDetail() {
        for (int i = 0; i < this.branches.size(); i++) {
            System.out.println("--- " + this.getBranch(i).getName() + " ---");
            for (int j = 0; j < this.getBranch(i).getCustomers().size(); j++) {
                System.out.println((j + 1) + ". " + this.getBranch(i).getCustomer(j).getName());
                for (int k = 0; k < this.getBranch(i).getCustomer(j).getTransaction().size(); k++) {
                    System.out.println("   -> (" + this.getBranch(i).getCustomer(j).getTransaction(k) + ")");
                }
            }
        }
    }

    public void printCustomerFromBranch(int branchPosition) {
        for (int i = 0; i < this.getBranch(branchPosition).getCustomers().size(); i++) {
            System.out.println((i + 1) + ". " + this.getBranch(branchPosition).getCustomer(i).getName());
        }
    }
}
