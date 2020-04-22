import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int counter = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                counter++;
                int number = scanner.nextInt();
                total += number;
            } else {
                break;
            }
        }
        float average;
        if(counter == 0){
            average = 0;
        }else{
            average = (float)total/counter;
        }
        System.out.println("SUM = " + total + " AVG = " + Math.round(average));

    }
}
