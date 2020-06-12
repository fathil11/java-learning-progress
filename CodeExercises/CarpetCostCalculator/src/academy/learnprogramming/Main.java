package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Floor floor = new Floor(2, 3);
        Carpet carpet = new Carpet(10000);

	    Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total cost : " + calculator.getTotalCost());
    }
}
