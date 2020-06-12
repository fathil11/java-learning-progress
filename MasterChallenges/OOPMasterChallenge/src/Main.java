public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Burger Eve", "Rye", "Chicken", 15000);
        hamburger.addAdditional1("Letuce", 5000);
        hamburger.addAdditional2("Tomato", 2000);
        hamburger.printReceipt();

        System.out.println();

        HealthyHamburger healthyHamburger = new HealthyHamburger("Healthy Burger", "Beef", 20000);
        healthyHamburger.addAdditional5("Weed", 2000);
        healthyHamburger.printReceipt();
    }
}
