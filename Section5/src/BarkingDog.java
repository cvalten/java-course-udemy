public class BarkingDog {

    public static void main(String[] args){
        System.out.println(shouldWakeUp(true,23));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        //boolean position always false
        boolean position = false;
        //unless barking is true
        if(barking) {
            //Check if hour of the day is between 0 and before 8, or after 22 (so only option is 23 :))
            if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23)) {
                position = true;
            }
        }
        return position;
    }
}