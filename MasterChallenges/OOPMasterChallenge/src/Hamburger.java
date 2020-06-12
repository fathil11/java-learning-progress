public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public void addAdditional1(String name, double price){
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addAdditional2(String name, double price){
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addAdditional3(String name, double price){
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addAdditional4(String name, double price){
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double calculateTotal(){
        double total = this.price;

        if(this.additionPrice1 != 0){
            total += this.additionPrice1;
        }
        if(this.additionPrice2 != 0){
            total += this.additionPrice2;
        }
        if(this.additionPrice3 != 0){
            total += this.additionPrice3;
        }
        if(this.additionPrice4 != 0){
            total += this.additionPrice4;
        }

        return total;
    }

    public void printReceipt(){
        System.out.println("---------- Bill's Burger ----------");
        System.out.println("# " + this.name + " ............... Rp. " + this.price);
        System.out.println("Bread (" + this.breadRoll + ") | Meat (" + this.meat + ")");
        System.out.println();

        if(this.additionPrice1 != 0){
            System.out.println("# " + this.additionName1 + " ............... Rp. " + this.additionPrice1);
        }
        if(this.additionPrice2 != 0){
            System.out.println("# " + this.additionName2 + " ............... Rp. " + this.additionPrice2);
        }
        if(this.additionPrice3 != 0){
            System.out.println("# " + this.additionName3 + " ............... Rp. " + this.additionPrice3);
        }
        if(this.additionPrice4 != 0){
            System.out.println("# " + this.additionName4 + " ............... Rp. " + this.additionPrice4);
        }
    }

    public void printTotal(){
        System.out.println("\nTotal : Rp. " + calculateTotal());
    }
}
