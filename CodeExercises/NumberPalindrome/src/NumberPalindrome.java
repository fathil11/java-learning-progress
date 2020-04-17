public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }

        int num = number;
        int reversed = 0;
        while(num > 0){
            reversed = (reversed*10) + num%10;
            num /= 10;
        }

        return number == reversed;
    }

}
