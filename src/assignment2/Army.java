package assignment2;

public class Army extends Fan {
    //Overrides fan price and gives 50% discount.
    @Override
    public double getPrice() {
        return super.getPrice() * 0.5;
    }
    //Overrides fan band color with green color.
    @Override
    public String getColor(int i) {
        return super.getColor(i);
    }
    //Prints out for army.
    public void ticket() {
        System.out.println("$" + getPrice() + " color: " + getColor(2));
    }

}
