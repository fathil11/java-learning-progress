public class HealthyHamburger extends Hamburger {
    private String additionName5;
    private double additionPrice5;

    private String additionName6;
    private double additionPrice6;

    public HealthyHamburger(String name, String meat, double price) {
        super(name, "Brown Rye", meat, price);
    }

    public void addAdditional5(String name, double price){
        this.additionName5 = name;
        this.additionPrice5 = price;
    }

    public void addAdditional6(String name, double price){
        this.additionName6 = name;
        this.additionPrice6 = price;
    }

    @Override
    public double calculateTotal() {
        double total = super.calculateTotal();
        if(this.additionPrice5 != 0){
            total += this.additionPrice5;
        }
        if(this.additionPrice6 != 0){
            total += this.additionPrice6;
        }
        return total;
    }

    @Override
    public void printReceipt() {
        super.printReceipt();

        if(this.additionPrice5 != 0){
            System.out.println("# " + this.additionName5 + " ............... Rp. " + this.additionPrice5);
        }
        if(this.additionPrice6 != 0){
            System.out.println("# " + this.additionName6 + " ............... Rp. " + this.additionPrice6);
        }
    }
}
