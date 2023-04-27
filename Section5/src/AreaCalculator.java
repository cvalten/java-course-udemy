public class AreaCalculator {

    public static void main(String[] args){
        System.out.println(area(5.5));
        System.out.println(area(0.0,0.0));
    }

    public static double area(double radius) {
        //Set areaCircle to -1.0
        double areaCircle = -1.0;
        //Set areaCircle to the value if radius is above or equal to 0.00
        if (radius >= 0.00){
            areaCircle = radius * radius * Math.PI;
        }
        return areaCircle;
    }

    public static double area(double x, double y) {
        //Set output to the value if area is above 0.00
        double area = -1.0;
        //Set areaCircle to the value if area is above or equal to 0.00
        if(x >=0.0 && y >=0.0){
            area =  x*y;
        }
        return area;
    }
}
