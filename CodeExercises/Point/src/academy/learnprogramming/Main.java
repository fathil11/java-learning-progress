package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println("Distance from 0,0 is : " + point.distance());
        System.out.println("Distance from 2,3 is : " + point.distance(2, 3));
        System.out.println("Distance from 7,5 (object) is : " + point.distance(new Point(7, 5)));
    }
}
