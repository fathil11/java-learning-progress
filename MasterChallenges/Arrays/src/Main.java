import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers(5);
        printArr(arr);
        sortDesc(arr);
        System.out.println();
        printArr(arr);
    }

    public static int[] getIntegers(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|" + arr[i] + "|");
        }
    }

    public static void sortDesc(int[] arr) {
        boolean sorted = false;

        while(!sorted){
            sorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
