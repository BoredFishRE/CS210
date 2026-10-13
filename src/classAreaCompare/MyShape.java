/*
Elliott Benson CS210
10/7/2026
This program will take the area of 2 shapes and will calculate said areas depending on selected shapes, then compare to
see which area is greater than the other.
 */
package classAreaCompare;
public class MyShape {
    public static void main(String[] args) {
        //defines the module doing 99% of the heavy lifting
        Area myShape = new Area();
        //sets while loop to false so it can run.
        boolean shapeDone = false;
        while (!shapeDone){
            //This kicks off the chain of modules. Asks which 2 shapes to use, gathers data required to calculate data, then calculates the area.
            myShape.areaGreat();
            //Does the final comparison to see which area is greater than or less than
            myShape.finalCompare();
            shapeDone = true;
        }
    }
}
