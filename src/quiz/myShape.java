package quiz;
import java.util.Scanner;
public class myShape {
    public static void main(String[] args) {
        boolean shapeDone = false;
        Scanner input = new Scanner(System.in);
        Area myShape = new Area();
        while (!shapeDone){
            System.out.println("Please enter 1 for Circle, 2 for triangle.");
            int shape = input.nextInt();
            if (shape == 1){
                System.out.println("Circle selected for 1st shape, 2nd shape will be Triangle");
                System.out.println("Please enter the radius of the circle");
                double cirRad = input.nextDouble();
                System.out.println("Please enter the base length of the triangle");
                double triBase = input.nextDouble();
                System.out.println("Please enter the height of the triangle");
                double triHeight = input.nextDouble();
                double cirArea = myShape.cirArea(cirRad);
                double triArea = myShape.triArea(triBase, triHeight);
                System.out.print("The circle's area is ");
                System.out.printf("%.2f%n", cirArea);
                System.out.print("and the triangle's area is ");
                System.out.printf("%.2f%n", cirArea);
                shapeDone = true;
            } else if (shape == 2){
                System.out.println("Triangle selected for 1st shape, 2nd shape will be Circle");
                System.out.println("Please enter the base length of the triangle");
                double triBase = input.nextDouble();
                System.out.println("Please enter the height of the triangle");
                double triHeight = input.nextDouble();
                System.out.println("Please enter the radius of the circle");
                double cirRad = input.nextDouble();
                double cirArea = myShape.cirArea(cirRad);
                double triArea = myShape.triArea(triBase, triHeight);
                System.out.print("The triangle's area is ");
                System.out.printf("%.2f%n", triArea);
                System.out.print("and the circle's area is ");
                System.out.printf("%.2f%n", cirArea);
                shapeDone = true;
            } else {
                System.out.println("Invalid selection, please try again");
            }
        }
    }
}
