public class MegaBytesConverter {

    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
    }
    //Create method to show the number of MB and remainder KB.
    public static void printMegaBytesAndKiloBytes(int kilobytes){
     //Define variables
        int devider = 1024;
        int MB = kilobytes / devider;
        int remainder = kilobytes % devider;
        //If kilobytes is less then 0, print invalid value
        if(kilobytes < 0)
        {
            System.out.println("Invalid Value");
        }
        //Else show the conversion
        else
        {
            System.out.println(kilobytes+ " KB = " +MB+" MB and " + remainder + " KB");
        }
    }
}
