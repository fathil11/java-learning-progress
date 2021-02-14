package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // We can't access a variable inside a code block from another code block
        // Example :
        if(2 < 3){
            int a = 5;
        }
        // We cant access variable a in here -> Sout(a)

        // Challenge
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(finalScore);
        }

    }
}
