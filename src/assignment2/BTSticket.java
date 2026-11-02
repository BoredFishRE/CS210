package assignment2;

public abstract class BTSticket {
    //Initial ticket price.
    private static final double price = 9.00;
    //Array for assigning band color. Makes changing it in the future easier.
    private static final String[] color = {"Red", "Pink", "Green"};
    //Abstract blueprint for ticket messaging.
    public abstract void ticket();
    //Allows public access to private price
    public double getPrice(){
        return price;
    }
    //Allows public access to private array
    public String getColor(int i){
        return color[i];
    }
}
