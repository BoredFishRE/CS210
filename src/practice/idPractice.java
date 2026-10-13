package practice;
import java.util.*;
public class idPractice {
    public static void main(String[] args) {
        /*Establish our initial variables and functions, these go OUTSIDE the while loop because
        they don't change depending on the user's input.*/
        Scanner input = new Scanner(System.in);
        /*This changes inside the while loop, however not depending on user input. Also is called before while loop
        otherwise I'll get an error.*/
        boolean idTrue = false;
        while(!idTrue){
            //Defining our variables that DO change while inside the while loop.
            System.out.println("Please enter your ID.");
            String idname = input.next();
            char f = idname.charAt(0);
            char l = idname.charAt(idname.length() - 1);
            int idlength = idname.length();
            //Checking first if the length is correct. I don't need to check anything else if it's false.
            if (idlength <= 4 && idlength >= 3) {
                if (f == l){
                    System.out.println("ID saved! Thank you!");
                    idTrue = true;
                } else {
                    System.out.println("ID needs matching first and last character");
                }
            } else if (idlength > 4){ //Too long? Too bad. Try again.
                System.out.println("ID is too long, please shorten and try again!");
            } else if (idlength < 3){ //Too short? Too bad. Try again.
                System.out.println("ID is too short, please shorten and try again!");
            } else { //Catches some outlying conditions.
                System.out.println("I missed something");
            }
        }
    }
}
