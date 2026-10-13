/*
Elliott Benson CS210
10/7/2026
 */
package classAreaCompare;
import java.util.Arrays;
public class MyShape {
    public static void main(String[] args) {
        boolean[] checkShape = Area.selectShape();
        Area myShape = new Area();
        String[] areaShape = {"circle", "triangle", "rectangle"};
        boolean shapeDone = false;
       while (!shapeDone){
            double[] areaVal = new double[3];
            System.out.println(Arrays.toString(checkShape));
            for (int i = 0; i < 3; i++){
                if (checkShape[i]){
                    areaVal[i] = myShape.getArea(i);
                    System.out.print("\nThe area of the " + areaShape[i] + " is ");
                    System.out.print(areaVal[i]);
                }
            }
            shapeDone = true;
        }
    }
}
