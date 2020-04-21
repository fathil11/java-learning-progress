public class Temp {
    public static int get(int number){
        if(number < 2){
            return -1;
        }
        
        int factor = number;
        int divider = number-1;
        while(divider > 2){
            System.out.println(divider);
            if(number % divider == 0){
                factor = number/divider;
            }
            divider--;
        }
        return factor;
    }
}
