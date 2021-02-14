public class Main {
    public static void main(String[] args) {
//        int newScore = calculateScore("Fathil", 500);
//        System.out.println("New score is " + newScore);
//
//        calculateScore(75);
//        calculateScore();
//        System.out.println(calcFeetAndInchesToCentimeters(7, 5));
        System.out.println(getDurationString(3945));
    }

    public static int calculateScore(String palyerName, int score){
        System.out.println("Player " + palyerName + " scored " + score + " points");
        return score*1000;
    }

    // Method Overloading -> same method, same return type, different parameter.
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score*1000;
    }

    // Another Method Overloading
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    // Challenge #1
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(!(feet >= 0) || !(inches >= 0 && inches <= 12)){
            return -1;
        }
        return (feet+calcFeetAndInchesToCentimeters(inches)) * 30.48d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(!(inches >= 0)){
            return -1;
        }
        return inches * 0.0833333d;
    }

    // Challenge #2
    public  static String getDurationString(int minutes, int seconds){
        if(!(minutes >= 0) || !(seconds >= 0 && seconds <= 59)){
            return "Invalid String";
        }
        int x = minutes / 60;
        String X = String.valueOf(x);
        if(x < 10){
            X = "0" + X;
        }
        int y = minutes % 60;
        String Y = String.valueOf(y);
        if(y < 10){
            Y = "0" + Y;
        }
        int z = seconds;
        String Z = String.valueOf(seconds);
        if(z < 10){
            Z = "0" + Z;
        }
        return X + "h " + Y + "m " + Z + 's';
    }

    public  static String getDurationString(int seconds){
        if(!(seconds >= 0)){
            return "Invalid String";
        }

        int y = seconds / 60;
        int z = seconds % 60;
        return getDurationString(y, z);
    }
}
