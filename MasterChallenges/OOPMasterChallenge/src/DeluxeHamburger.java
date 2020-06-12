public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger(String name, String breadRoll, String meat, double price) {
        super(name, breadRoll, meat, price);
        super.addAdditional1("Chips", 5000);
        super.addAdditional2("Drinks", 10000);
    }

    @Override
    public void addAdditional1(String name, double price) {
        System.out.println("You can't add additional item for Deluxe Burger");
    }

    @Override
    public void addAdditional2(String name, double price) {
        System.out.println("You can't add additional item for Deluxe Burger");
    }

    @Override
    public void addAdditional3(String name, double price) {
        System.out.println("You can't add additional item for Deluxe Burger");
    }

    @Override
    public void addAdditional4(String name, double price) {
        System.out.println("You can't add additional item for Deluxe Burger");
    }
}
