package practice;

public class q9_myShape {
    public static void main(String[] args) {
        int width1 = 5;
        int height1 = 6;
        int width2 = 10;
        int height2 = 5;
        RectArea area1 = new RectArea(width1,height1);
        RectArea area2 = new RectArea(width2,height2);
        System.out.println("Rect Area1= " + area1.getRectArea());
        System.out.println("Rect Area2= " + area2.getRectArea());
    }
}
