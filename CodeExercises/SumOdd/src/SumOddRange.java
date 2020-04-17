public class SumOddRange {
    public static int sumOdd(int start, int end){
        if(end < start || end <= 0 || start <= 0){
            return -1;
        }

        int total = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                total += i;
            }
        }
        return total;
    }

    public static boolean isOdd(int number){
        return number % 2 != 0 && number >= 0;
    }
}
