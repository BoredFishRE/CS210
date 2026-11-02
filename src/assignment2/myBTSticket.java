/*
Elliott Benson  11/1/2026 CS210
This program takes a person's level as a fan and gives them a wristband and a discount based on that level.
Non fans get no discount and a red band.
Fan gets 50% off and a Pink band.
Army gets 50% off the Fan price and a green band.
 */
package assignment2;
//The next 3 classes assign a person's name to fan level.
class Chloe {
    public static void ticket(){
        BTSticket nonFan = new NonFan();
        nonFan.ticket();
    }
}
class Ted {
    public static void ticket(){
        BTSticket fan = new Fan();
        fan.ticket();
    }
}
class Malja {
    public static void ticket(){
        BTSticket army = new Army();
        army.ticket();
    }
}
//The most empty main file I've written in awhile. Just runs the above classes.
public class myBTSticket {
    public static void main(String[] args) {
        Chloe.ticket();
        Ted.ticket();
        Malja.ticket();
    }
}
