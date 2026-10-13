package practice;
import java.util.Scanner;
public class classesPractice {
    public static void main(String[] args) {
        CreateShape myShape = new CreateShape();
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a shape. Type 1 for Circle, 2 for triangle.");
        int shape = input.nextInt();
        boolean areaDone = false;
        while(!areaDone) {
            if (shape == 1) {
                System.out.println("Please type the radius");
                double radius = input.nextDouble();
                double cirArea = myShape.cirArea(radius);
                System.out.println("The area of the circle is" + cirArea);
                areaDone = true;
            } else if (shape == 2){
                System.out.println("Please type the base length of the triangle");
                double base = input.nextDouble();
                System.out.println("Please type the height of the triangle");
                double height = input.nextDouble();
                System.out.println("Base is " + base);
                System.out.println("Height is" + height);
                double triArea = myShape.triArea(base, height);
                System.out.println("The area of the triangle is " + triArea);
                areaDone = true;
            } else {
                System.out.println("Incorrect choice, please try again");
                input.next();
            }
        }
    }
}
