import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 5;
        int[] arr = readIntegers(count);
        System.out.println(findMin(arr));
    }

    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        for(int i = 0; i < count; i ++){
            System.out.print("Number " + (i+1) + " : ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
