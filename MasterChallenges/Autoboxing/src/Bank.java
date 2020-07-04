import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.branches = new ArrayList<Branch>();
        this.name = name;
    }

    public static Bank createBank(String name) {
        return new Bank(name);
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public Branch getBranch(int position) {
        if(position < 0 && position >= this.branches.size()){
            System.out.println("Branch is not exists");
            return null;
        }
        return this.branches.get(position);
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branchName) {
        if (queryBranch(branchName) == null) {
            this.branches.add(Branch.createBranch(branchName));
            return true;
        }
        System.out.println("Branch already registered");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double firstTransaction) {
        Branch branch = queryBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, firstTransaction);
        }
        System.out.println("Branch is not exists");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = queryBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        System.out.println("Branch is not exists");
        return false;
    }

    public boolean updateBranchName(String oldBranchName, String newBranchName) {
        Branch branch = queryBranch(oldBranchName);
        if (branch != null) {
            branch.setName(newBranchName);
            return true;
        }
        System.out.println("Branch is not exists");
        return false;
    }

    public boolean updateCustomerName(String branchName, String oldCustomerName, String newCustomerName) {
        Branch branch = queryBranch(branchName);
        if (branch != null) {
            return branch.updateCustomerName(oldCustomerName, newCustomerName);
        }
        System.out.println("Branch is not exists");
        return false;
    }

    public boolean removeBranch(int position) {
        if (position >= 0 && position < this.branches.size()) {
            this.branches.remove(position);
            return true;
        }
        System.out.println("Branch is not exists");
        return false;
    }

    public boolean printBranches() {
        if (!branchIsEmpty()) {
            for (int i = 0; i < this.branches.size(); i++) {
                System.out.println((i + 1) + ". " + getBranch(i).getName());
            }
            return true;
        }
        System.out.println("Branch is empty");
        return false;
    }

    private boolean branchIsEmpty() {
        return this.branches.size() == 0;
    }

    private int findBranch(Branch branch) {
        return this.branches.indexOf(branch);
    }

    private int findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.getBranch(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Branch queryBranch(String name) {
        int index = findBranch(name);
        if (index < 0) {
            return null;
        }
        return this.getBranch(index);
    }

}
