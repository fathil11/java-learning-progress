package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myIntMinValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer min value : " + myIntMinValue);
        System.out.println("Integer max value : " + myIntMaxValue);

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte max value : " + myByteMaxValue);
        System.out.println("Byte min value : " + myByteMinValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short max value : " + myShortMaxValue);
        System.out.println("Short min value : " + myShortMinValue);

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long max value : " + myLongMaxValue);
        System.out.println("Long min value : " + myLongMinValue);

        // Casting
        int myNewIntValue = (myIntMaxValue/2);
        byte myNewByteValue = (byte) (myByteMaxValue/2);
        short myNewShortValue = (short) (myShortMaxValue/2);

        // Primitive Challenge
        System.out.println("--- Challenge ---");
        byte varByte = 8;
        short varShort = 127;
        int varInt = 10000;
        long varLong = 50000L + 10L*(varByte + varShort + varInt);
        System.out.println(varLong);

    }
}
