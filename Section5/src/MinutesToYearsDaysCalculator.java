public class MinutesToYearsDaysCalculator {

    public static void main(String[] args){
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        //Warn if minutes is less then 0
        if(minutes <0)
        {
            System.out.println("Invalid Value");
        } else {

            long days = (minutes / 1440); //Days have 1440 minutes in it (60 minutes per hour, 24 hours)
            long remainderDays = days % 365; //Remainder days
            long years = days / 365; //Days divide by 365 days in a normal year. (leap year not in taken. Should be 365,25 days? :))
            //Show output
            System.out.println(minutes + " min = " + years + " y and " + remainderDays + " d");
        }
    }
}
