package classAreaCompare;
import java.util.Scanner;

public class Area {
    double finalArea = 0;
    Scanner input = new Scanner(System.in);
    public double triArea(double base, double height){
        double area = base * height / 2.0;
        return area;
    }
    public double cirArea(double radius){
        double area = Math.PI * Math.pow(radius, 2.0);
        return area;
    }
    public double recArea(double base, double height){
        double area = base * height;
        return area;
    }
    public static boolean[] selectShape() {
        boolean[] shapeSelected = new boolean[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Please select 1 for Circle, 2 for Triangle, 3 for Rectangle for your first shape.");
        int firSel = input.nextInt();
        shapeSelected[firSel - 1] = true;
        System.out.println("Please select 1 for Circle, 2 for Triangle, 3 for Rectangle for your second shape.");
        int sndSel = input.nextInt();
        shapeSelected[sndSel - 1] = true;
        return shapeSelected;
    }
    public double getArea(int i){
        switch(i) {
            case 0:
                System.out.print("\nPlease enter radius of the circle\n");
                finalArea = cirArea(input.nextDouble());
                break;
            case 1:
                System.out.print("\nPlease enter the base of the triangle\n");
                double tribase = input.nextDouble();
                System.out.print("Please enter the height of the triangle");
                double triheight = input.nextDouble();
                finalArea = triArea(tribase, triheight);
                break;
            case 2:
                System.out.print("\nPlease enter the base of the rectangle\n");
                double recbase = input.nextDouble();
                System.out.print("Please enter the height of the rectangle");
                double recheight = input.nextDouble();
                finalArea = recArea(recbase, recheight);
                break;
            default:
                System.out.println("what");
        }
        return finalArea;
    }
     public static String checkArea(){
        String goon = "goon";
        return goon;
    }
}
