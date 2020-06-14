import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public static Branch create(String name) {
        return new Branch(name);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(int i) {
        return customers.get(i);
    }

    public String addCustomer(String name, double firstTransaction) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.getCustomer(i).getName().equals(name)) {
                return "Customer already exists !";
            }
        }

        if (this.customers.add(Customer.create(name, firstTransaction))) {
            return "Success";
        }

        return "Something wrong when adding customer !";
    }

    public boolean customerIsExists(int i){
        return i < this.customers.size();
    }

    public void printCustomers() {
        for (int i = 0; i < this.customers.size(); i++) {
            System.out.println((i + 1) + ". " + this.getCustomer(i) +
                    " (" + this.getCustomer(i) + ")");
        }
    }
}
