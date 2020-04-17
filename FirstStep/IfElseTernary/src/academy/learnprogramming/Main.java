package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // If Elseif Else
        int score = 25;

        if(score >= 84){
            System.out.println("Pass get A");
        }else if(score >= 75 && score < 84){
            System.out.println("Pass get B");
        }else if(score >=60 && score < 75){
            System.out.println("Pass get C");
        }else if(score >= 50 && score < 60){
            System.out.println("Not pass get D");
        }else{
            System.out.println("Not pass get E");
        }

        // Ternary Operator
        boolean isExpensive = true;
        int price = isExpensive ? 10 : 5;
        System.out.println(price);


        // Challenge
        double a = 20.00d;
        double b = 80.00d;
        double proc1 = ((a + b) * 100d) % 40d;
        boolean test = (proc1 == 0) ? true : false;
        System.out.println("The result is : " + test);
        if(!test){
            System.out.println("Got some remainder");
        }
    }
}
