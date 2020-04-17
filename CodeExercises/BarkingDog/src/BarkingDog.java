public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean should;
        if (hourOfDay < 0 || hourOfDay > 23) {
            should = false;
        }else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            should = true;
        }else{
            should = false;
        }

        return should;
    }
}
