package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Parsing literal arguments
        printCalculatedScore(true, 800, 5, 100);

        // Parsing variable arguments
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        printCalculatedScore(gameOver, score, levelCompleted, bonus);

        // Challenge
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Dany", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Edgar", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Linda", highScorePosition);
    }

    public static void printCalculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
        }
    }

    public static int calculatedScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }else{
            return -1;
        }
    }

    // Challenge
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " at position " + position);
    }

    public static int calculateHighScorePosition(int finalScore){
        int position = 4;
        if(finalScore >= 1000)
            position = 1;
        else if(finalScore >= 500)
            position = 2;
        else if(finalScore >= 100)
            position = 3;
        return position;
    }

}
