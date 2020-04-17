public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int intNumber1 = (int)(1000*number1);
        int intNumber2 = (int)(1000*number2);
        return intNumber1 == intNumber2;
    }
}
