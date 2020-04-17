public class WhileDoWhile {
    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 10){
            System.out.println("Counter " + counter);
            counter++;
        }

        counter = 1;
        do{
            System.out.println("#2 Counter " + counter);
            counter++;
        }while(counter <= 10);

        System.out.println("--------------");
        // Challenge
        System.out.println(sumDigits(3241));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int total = 0;

        while(number > 0){
            total += number%10;
            number /= 10;
        }
        return total;
    }
}
