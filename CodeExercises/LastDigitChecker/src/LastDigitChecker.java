public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }

    public static boolean isValid(int number){
        if(!(number >= 10 && number <= 1000)){
            return false;
        }
        return true;
    }
}
