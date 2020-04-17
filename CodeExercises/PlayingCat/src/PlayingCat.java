public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature >= 25){
            if((summer && temperature <= 45 )||(!summer && temperature <= 35)){
                return true;
            }
        }
        return false;
    }
}
