package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        Car holden = new Car();

        porche.setModel("Carrera");
        holden.setModel("911");

        System.out.println("The model from porche is "+ porche.getModel());
        System.out.println("The model from holden is "+ holden.getModel());
    }
}
