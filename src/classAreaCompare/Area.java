package classAreaCompare;
import java.util.Scanner;

public class Area {
    //Sets final area to 0 to use later
    double finalArea = 0;
    //Sets input for future scanner.
    Scanner input = new Scanner(System.in);
    //Constant. This is essential so I don't have to create 500 if else statements. Just sets each shape to a number.
    static String[] areaShape = {"circle", "triangle", "rectangle"};
    //The rest of these are so I don't have to declare an array 15 times.
    static String[] areaShapeCompare = new String[2];
    static boolean[] shapeSelected = new boolean[3];
    static double[] areaValCompare = new double[2];
    static boolean[] checkShape = Area.selectShape();
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
    //This module initiates the selection of a shape.
    public static boolean[] selectShape() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select 1 for Circle, 2 for Triangle, 3 for Rectangle for your first shape.");
        int firSel = input.nextInt();
        //Sets the number to the array so I can see that a shape has been selected. For example, if 1 = true, circle has been selected
        shapeSelected[firSel - 1] = true;
        //This does the same as the line above, BUT sets the string for the final comparison. Makes my life easier.
        areaShapeCompare[0] = areaShape[firSel - 1];
        System.out.println("Please select 1 for Circle, 2 for Triangle, 3 for Rectangle for your second shape.");
        int sndSel = input.nextInt();
        shapeSelected[sndSel - 1] = true;
        areaShapeCompare[1] = areaShape[sndSel - 1];
        //Writes to the array.
        return shapeSelected;
    }
    public double getArea(int i){
        //This switch statement pulls double duty. It'll be able to match the array and gather the data for the array.
        switch(i) {
            case 0:
                System.out.print("\nPlease enter radius of the circle\n");
                finalArea = cirArea(input.nextDouble());
                break;
            case 1:
                System.out.print("\nPlease enter the base of the triangle\n");
                double tribase = input.nextDouble();
                System.out.println("Please enter the height of the triangle");
                double triheight = input.nextDouble();
                finalArea = triArea(tribase, triheight);
                break;
            case 2:
                System.out.print("\nPlease enter the base of the rectangle\n");
                double recbase = input.nextDouble();
                System.out.println("Please enter the height of the rectangle");
                double recheight = input.nextDouble();
                finalArea = recArea(recbase, recheight);
                break;
        }
        return finalArea;
    }
    //This is what ultimately runs the above module. For each number, it gets the area, and then writes it to the areaVal array.
     public double[] checkArea(){
         double[] areaVal = new double[3];
         Area myShape = new Area();
         for (int i = 0; i < 3; i++){
             if (checkShape[i]){
                 areaVal[i] = myShape.getArea(i);
             }
         }
         return areaVal;
    }
    //Feeds into final compare, and what we run in the main file. Also prints the area.
    public double[] areaGreat(){
        double[] areaVal = checkArea();
        for (int i = 0; i < 3; i++) {
            if (checkShape[i]){
                int ai = i;
                /*this part is funky and is what had me stumped for awhile. I need to push the array down from 3 to 2
                spots for the final comparison.
                So, what I did was create another integer that followed the main integer, and stripped out the not used
                shape to make the final comparison easier.
                 */
                if (i == 2 | shapeSelected[1] && shapeSelected[2]){
                    ai = i - 1;
                }
                System.out.println("\nThe area of the " + areaShape[i] + " is ");
                System.out.printf("%.2f%n", areaVal[i]);
                areaValCompare[ai] = areaVal[i];
            }
        }
        return areaValCompare;
    }
    //This is the final comparison between the 2 areas. It's a bit messy but all it does is check if one is greater than the other.
    public void finalCompare(){
        if (areaValCompare[0] > areaValCompare[1]){
            System.out.print("The area of the " + areaShapeCompare[0] + " is ");
            System.out.printf("%.2f", areaValCompare[0]/areaValCompare[1]);
            System.out.print(" times greater than the area of the " + areaShapeCompare[1]);
        } else if (areaValCompare[1] > areaValCompare[0]){
            System.out.print("The area of the " + areaShapeCompare[1] + " is ");
            System.out.printf("%.2f", areaValCompare[1]/areaValCompare[0]);
            System.out.print(" times greater than the area of the " + areaShapeCompare[0]);
        } else if (areaValCompare[0] == areaValCompare[1]){
            System.out.println(areaShapeCompare[0] + " and " + areaShapeCompare[1] + " are equal.");
        }
    }
}
