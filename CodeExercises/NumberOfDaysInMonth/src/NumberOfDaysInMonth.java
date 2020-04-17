public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        boolean yearRange = year >= 1 && year <= 9999;
        boolean step1 = year % 4 == 0;
        boolean step2 = year % 100 == 0;
        boolean step3 = year % 400 == 0;
        return yearRange && (step1 && step2 && step3 || step1 && !step2);
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12){
            return -1;
        }else if(year < 1 || year > 9999){
            return -1;
        }

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                if(isLeapYear(year)){
                    return 29;
                }else{
                    return 28;
                }
        }
    }
}
