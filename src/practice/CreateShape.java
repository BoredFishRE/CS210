package practice;

public class CreateShape {
    public double triArea(double base, double height){
        double area = base * height / 2.0;
        return area;
    }
    public double cirArea(double radius){
        double area = Math.PI * Math.pow(radius, 2.0);
        return area;
    }
}
