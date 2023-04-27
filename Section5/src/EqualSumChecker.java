public class EqualSumChecker {

    public static void main(String[] args){
        System.out.println(hasEqualSum(1,-1,4));
    }

    public static boolean hasEqualSum(int a, int b, int c) {
        //Return position value
        return (a + b) == c;
    }
}
