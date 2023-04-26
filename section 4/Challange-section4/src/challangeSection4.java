public class challangeSection4 {
    public static void main(String[] args){
        //Create some variables (step1 & step 2)
        double firstDouble = 20.00;
        double secondDouble = 80.00;
        //Step 3, multiply by 100.00
        double sum1 = (firstDouble + secondDouble)*100d;
        System.out.println("Sum is:" +sum1);
        // Step 4 - Remainder
        int remainder = (int) (sum1 % 40);
        System.out.println("Remainder is:" + remainder);
        //Step 5 - Boolean  & 6, show bool
        boolean remainderTrue = false;
        if ((remainder == 0.00)) {
            remainderTrue = true;
        }
        System.out.println("Remainder output: " +remainderTrue);
        //Step 7, if-then statement
        if(remainderTrue == false){
            System.out.println("Got some remainder");
        }
    }
}
