public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        while (first != second) {
            if(first > second) {
                first = first - second;
            }else {
                second = second - first;
            }
        }
        return first;
    }
}
