package classAreaCompare;
import java.util.Scanner;

public class Area {
    //This module calculates the area of the triangle
    public double triArea(double base, double height){
        double area = base * height / 2.0;
        return area;
    }
    //This module calculates the area of the circle
    public double cirArea(double radius){
        double area = Math.PI * Math.pow(radius, 2.0);
        return area;
    }
    //This module calculates the area of the rectangle
    public double recArea(double base, double height){
        double area = base * height;
        return area;
    }
}
