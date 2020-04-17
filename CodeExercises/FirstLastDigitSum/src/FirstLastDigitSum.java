public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int lastNumber = number % 10;
        int firstNumber = 0;
        while(number > 0){
            firstNumber = number % 10;
            number /= 10;
        }

        return firstNumber + lastNumber;
    }
}
