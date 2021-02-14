package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value is 1");
//        }else if(value == 2){
//            System.out.println("Value is 2");
//        }else{
//            System.out.println("Value is not 1 or 2");
//        }

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value is 1");
                break;

            case 2:
                System.out.println("Value is 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Value is 3 or 4 or 5");

            default:
                System.out.println("Valus is not 1 or 2");
                break;
        }

        // Challenge
        char switchChar = 'A';
        switch (switchChar){
            case 'A':
                System.out.println("Chararacter is A");
                break;
            case 'B':
                System.out.println("Chararacter is B");
                break;
            case 'C':
                System.out.println("Chararacter is C");
                break;
            case 'D':
                System.out.println("Chararacter is D");
                break;
            case 'E':
                System.out.println("Chararacter is E");
                break;
            default:
                System.out.println("Character not found");
                break;
        }

        printDayOfWeek(0);
        printDayOfWeek(2);
    }

    // Challenge #2
    public static void printDayOfWeek(int number){
        switch (number){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Value");
                break;
        }
    }
}
