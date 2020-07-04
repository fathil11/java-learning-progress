import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.customers = new ArrayList<Customer>();
        this.name = name;
    }

    public static Branch createBranch(String name) {
        return new Branch(name);
    }

    public String getName() {
        return name;
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomer(int position) {
        if(position < 0 && position >= this.customers.size()){
            System.out.println("Customer is not exists");
            return null;
        }
        return this.customers.get(position);
    }

    public boolean addCustomer(String customerName, double firstTransaction) {
        if (queryCustomer(customerName) == null) {
            this.customers.add(Customer.createCustomer(customerName, firstTransaction));
            return true;
        }
        System.out.println("Customer is already registered");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = queryCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(amount);
            return true;
        }
        System.out.println("Customer is not exists");
        return false;
    }

    public boolean updateCustomerName(String oldCustomerName, String newCustomerName) {
        Customer customer = queryCustomer(oldCustomerName);
        if (customer != null) {
            customer.setName(newCustomerName);
            return true;
        }
        System.out.println("Customer is not exists");
        return false;
    }

    public boolean removeCustomer(int position) {
        if (position >= 0 && position < this.customers.size()) {
            this.customers.remove(position);
            return true;
        }
        System.out.println("Customer is not exists");
        return false;
    }

    public boolean printCustomers() {
        if (!customerIsEmpty()) {
            for (int i = 0; i < this.customers.size(); i++) {
                System.out.println((i + 1) + ". " + getCustomer(i).getName());
            }
            return true;
        }
        System.out.println("Customer is not exists");
        return false;
    }

    private int findCustomer(Customer customer) {
        return this.customers.indexOf(customer);
    }

    private int findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.getCustomer(i);
            if (customer.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Customer queryCustomer(String name) {
        int index = findCustomer(name);
        if (index < 0) {
            return null;
        }
        return getCustomer(index);
    }

    private boolean customerIsEmpty() {
        return this.customers.size() == 0;
    }

    public void setName(String name) {
        this.name = name;
    }
}
