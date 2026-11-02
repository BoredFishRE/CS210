package assignment2;

public class NonFan extends BTSticket {
    //This repeats for all 3, but they're all the basic principle.
    //Overrides previous price but since this is a non fan price it's going to be the same.
    @Override
    public double getPrice(){
        return super.getPrice();
    }
    //Overrides previous band color but since this is a non fan color it's going to be the same.
    @Override
    public String getColor(int i){
        return super.getColor(i);
    }
    //Prints out for non fan.
    @Override
    public void ticket() {
        System.out.println("$" + getPrice() + " color: " + getColor(0));
    }
}
