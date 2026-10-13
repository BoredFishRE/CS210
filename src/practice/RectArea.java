package practice;

public class RectArea {
    private int width;
    private int height;
    RectArea(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getRectArea() {
        return width * height;
    }
}
