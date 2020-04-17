public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b){
        if(!(a >= 10 && a <= 99) || !(b >= 10 && b <= 99)){
            return false;
        }

        while(a > 0){
            int bProc = b;
            while(bProc > 0){
                if(a % 10 == bProc % 10){
                    return true;
                }
                bProc /= 10;
            }
            a /= 10;
        }

        return false;
    }
}
