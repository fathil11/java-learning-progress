package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("MyString is equal to : " + myString);
        myString = myString + ", and many more.";
        System.out.println("MyString is equal to : " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("MyString is equal to : " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.92";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber = 120.47d;



    }
}
