public class Main {
    public static void main(String[] args) {
        String yearString = "2018";
        System.out.println("String : " + yearString);

        int yearInt = Integer.parseInt(yearString);
        double yearDouble = Double.parseDouble(yearString);
        System.out.println("Number : " + yearInt);

        yearString += 1;
        yearInt += 1;

        System.out.println("String : " + yearString);
        System.out.println("Number : " + yearInt);


    }
}
