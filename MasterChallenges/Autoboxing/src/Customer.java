import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double firstTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(firstTransaction);
    }

    public static Customer createCustomer(String name, double firstTransaction) {
        return new Customer(name, firstTransaction);
    }

    public String getName() {
        return this.name;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

    public boolean printTransaction() {
        if (!transactionIsEmpty()) {
            for (int i = 0; i < this.transactions.size(); i++) {
                System.out.println((i + 1) + ". " + getTransaction(i));
            }
            return true;
        }
        System.out.println("Transaction is empty");
        return false;
    }
    public ArrayList<Double> getTransaction() {
        return this.transactions;
    }

    public double getTransaction(int position) {
        return this.transactions.get(position);
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean transactionIsEmpty(){
        return this.transactions.size() == 0;
    }
}
