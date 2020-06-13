import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = getIntegers(5);

        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getIntegers(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void reverseArr(int[] arr){
        int maxIndex = arr.length - 1;

        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
    }
}
