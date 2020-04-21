package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth : ");

        if (scanner.hasNextInt()) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            if (yearOfBirth >= 0 && yearOfBirth <= 2020) {
                // Add before next line, to resolve enter as the input of the next line.
                System.out.println("Enter your name : ");
                String name = scanner.nextLine();

                int age = 2020 - yearOfBirth;

                System.out.println("Your name is " + name);
                System.out.println("Your age is " + age);
            } else {
                System.out.println("Invalid Value");
            }
        } else {
            System.out.println("Invalid Value");
        }

        // Challenge #1
//        sumTenNumbers();

        // Challenge #2
        printMinMaxNumbers();
        scanner.close();
    }


    public static void sumTenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int total = 0;
        boolean isValid = true;
        while (counter < 10 && isValid) {
            System.out.println("Enter number #" + (counter + 1) + ":");
            if (scanner.hasNextInt()) {
                total += scanner.nextInt();
            } else {
                isValid = false;
            }
            counter++;
        }

        if (isValid) {
            System.out.println("Sum of ten number is equal to " + total);
        } else {
            System.out.println("Invalid Number");
        }

    }

    public static void printMinMaxNumbers() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        while (true) {
            System.out.println("Enter Number : ");
            if (scanner.hasNextInt()) {
                if (min == 0 || max == 0) {
                    min = scanner.nextInt();
                    max = min;
                } else {
                    int number = scanner.nextInt();
                    if (number < min) min = number;
                    else if (number > max) max = number;
                }
                System.out.println("---");
                System.out.println("Max Value : " + max);
                System.out.println("Min Value : " + min);
                System.out.println("---");
            } else {
                System.out.println("Max Value : " + max);
                System.out.println("Min Value : " + min);
                break;
            }
            scanner.nextLine();
        }
    }
}
