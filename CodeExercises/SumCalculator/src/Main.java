public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(2);
        calculator.setSecondNumber(5);
        System.out.println(calculator.getAdditionResult() + " | " +
                calculator.getSubtractionResult() + " | " +
                calculator.getMultiplicationResult() + " | " +
                calculator.getDivisionResult() + " | ");
    }
}
