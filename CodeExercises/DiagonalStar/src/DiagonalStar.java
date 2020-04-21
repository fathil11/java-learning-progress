public class DiagonalStar {
    public static void printSquareStar(int number) {
        
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        boolean isOdd = number % 2 != 0;

        int half = number / 2;
        for (int i = 0; i < half; i++) {
            if (i == 0) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < number / 2; j++) {
                    if (j == 0 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (number % 2 != 0) {
                    System.out.print(" ");
                }
                for (int j = (number / 2) - 1; j >= 0; j--) {
                    if (j == 0 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        int customCounter = half - 1;
        if (isOdd) {
            customCounter = half;
        }
        if (isOdd) {
            for (int i = 0; i < number; i++) {
                if (i == 0 || i == number - 1 || i == number / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = half - 1; i >= 0; i--) {
            if (i == 0) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < half; j++) {
                    if (j == 0 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = customCounter; j >= 0; j--) {
                    if (j == 0 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
