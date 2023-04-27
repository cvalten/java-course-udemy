public class SpeedConverter {
    public static void main (String[] args){
        printConversion(0);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        //Define the variables for calculation
        double oneMileInKm = 1.609;
        if(kilometersPerHour <0)
        {
            return -1;
        }
        else
        {
            double converted = (kilometersPerHour / oneMileInKm);
            double rounded = Math.round(converted);
            return (int) rounded;
        }
    }
    public static void printConversion(double kilometersPerHour){
//Create milesPerHour var for further use
        long milesPerHour = toMilesPerHour(kilometersPerHour);
//If kilometersPerHour is less or equal then 0 (u can't devide 0
        if(kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        }
        //Else show the conversion
        else
        {
            System.out.println(kilometersPerHour+ " km/h = " +milesPerHour+" mi/h");
        }

    }
}
