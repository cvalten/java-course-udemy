public class PlayingCat {
    public static void main(String[] args){
        System.out.println(isCatPlaying(true,40));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        //boolean position always false
        boolean position = false;
        //Define min and max temp without summer
        int minTemp = 25;
        int maxTemp = 35;
        //unless barking is true
        if(summer) {
            maxTemp = 45;
        }
        //Check if cat is playing within the temps :)
        if ((temperature >= minTemp && temperature <=maxTemp)) {
            position = true;
        }
        return position;
    }
}