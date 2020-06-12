public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1, 2);
        ComplexNumber two = new ComplexNumber(3, 4);

        one.add(1, 4);
        System.out.println("One Real ->" + one.getReal());
        System.out.println("One Imaginary ->" + one.getImaginary());

        one.add(two);
        System.out.println("One Real ->" + one.getReal());
        System.out.println("One Imaginary ->" + one.getImaginary());

        one.subtract(1, 4);
        System.out.println("One Real ->" + one.getReal());
        System.out.println("One Imaginary ->" + one.getImaginary());

        one.subtract(two);
        System.out.println("One Real ->" + one.getReal());
        System.out.println("One Imaginary ->" + one.getImaginary());
    }
}

