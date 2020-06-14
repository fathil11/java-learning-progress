import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        this.transaction.add(transaction);
    }

    public static Customer create(String name, double firstTransaction){
        return new Customer(name, firstTransaction);
    }

    public String addTransaction(double amount){
        if(this.transaction.add(amount)){
            return "Success";
        }
        return "Something wrong when adding transaction !";
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public double getTransaction(int i) {
        return transaction.get(i);
    }
}
