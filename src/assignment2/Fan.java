package assignment2;

public class Fan extends NonFan {
    //Overrides non fan price and gives 50% discount.
    @Override
    public double getPrice(){
        return super.getPrice() * 0.5;
    }
    //Overrides non fan band color with pink color.
    @Override
    public String getColor(int i){
        return super.getColor(i);
    }
    //Prints out for fan.
    public void ticket() {
        System.out.println("$" + getPrice() + " color: " + getColor(1));
    }
}
