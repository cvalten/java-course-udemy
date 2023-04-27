public class LeapYear {
    public static void main(String[] args){
     System.out.println(isLeapYear(2500));
    }
    public static boolean isLeapYear (int year){
        //Determine if the year is greater or equal to 1 en less or equal to 9999
        if (year >= 1 && year <= 9999) {
            //Can u devide by 4?
            if (year % 4 == 0){
                if (year % 100 == 0){
                    return  (year % 400 == 0);
                } else return true;
            } else return false;
        } else return false;
    }
}
