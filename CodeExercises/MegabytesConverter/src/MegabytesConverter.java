public class MegabytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int realNumber = kiloBytes / 1024;
            int commaNumber = kiloBytes % 1024;
            System.out.println(kiloBytes + " = " + realNumber + " MB and " + commaNumber + " KB");
        }
    }
}
