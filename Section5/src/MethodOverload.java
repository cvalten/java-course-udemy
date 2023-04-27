public class MethodOverload {
    public static void main(String[] args) {
        //call method
        System.out.println(convertToCentimeters(6,0));
    }
    public static double convertToCentimeters(int inches) {
    //Convert the inches to centimeters double. 1 inch is 2.54
        return (inches * 2.54);
    }
    public static double convertToCentimeters(int feet, int inches) {
        //1 foot is 12 inches, so total inches is feet*12 + inches given.
        int totalInches = (feet*12)+inches;
        //Convert to centimeters
        return convertToCentimeters(totalInches);
    }
}