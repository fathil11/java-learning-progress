public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int divider = 2;
        while(divider < number){
            if(number % divider == 0){
                number /= divider;
            }else{
                divider++;
            }
        }
        return number;
    }
}
