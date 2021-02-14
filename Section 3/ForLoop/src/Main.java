public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        System.out.println("-------------");

        for(int i = 50; i <= 80; i+=5){
            System.out.println(i + " persen dari 777 adalah " + calculatePercentage(777, i));
        }

        System.out.println("-------------");

        // Challenge
        int count = 0;
        for(int i=99; i<200; i++){
            if(count == 3){
                break;
            }else if(isPrime(i)){
                System.out.println("Prime number : " + i);
                count++;
            }
        }
    }

    public static int calculatePercentage(int number, int percentage){
        return number * percentage / 100;
    }

    // Challenge
    public static boolean isPrime(int number){
        if(number == 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}
