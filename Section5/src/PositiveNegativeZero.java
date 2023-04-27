public class PositiveNegativeZero {
    public static void main(String[] args){
        //Just for running in intellijea the Main function
        checkNumber(10);
        checkNumber(0);
        checkNumber(-5);
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }
        else if (number == 0)
        {
            System.out.println("zero");
        }
        else{
            System.out.println("negative");
        }

    }

}
