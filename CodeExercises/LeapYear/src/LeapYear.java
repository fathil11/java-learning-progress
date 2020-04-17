public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean leap = false;
        // Validation
        if (year < 0 || year > 9999) {
            leap = false;
        } else {
            // Check
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        leap = true;
                    } else {
                        leap = false;
                    }
                } else {
                    leap = true;
                }
            } else {
                leap = false;
            }
        }

        return leap;
    }
}
