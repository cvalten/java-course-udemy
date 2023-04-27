public class DecimalComperator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        //Default false
        boolean position = false;
        //To check on 3 decimals, just multiply by 1000
        double aa = a*1000;
        double bb = b*1000;
        //After that, compare the numbers (just use int, cause we use the multiplied values.
        if((int)aa == (int)bb){
            position = true;
        }
        //Return position value
        return position;
    }
}