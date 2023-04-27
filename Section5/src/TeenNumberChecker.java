public class TeenNumberChecker {
    public static void main(String[] args){
        System.out.println(hasTeen(0,14,20));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        //Return ture if i or i1 or i2 is between 12 and 20 (so 13-19)
        return (isTeen(age1) || isTeen(age2) || isTeen(age3));
    }
    public static boolean isTeen(int i) {
        //Return ture if i is between 12 and 20 (so 13-19)
        return (i >12 && i<20);
    }
}