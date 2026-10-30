package practice;
import java.util.Scanner;
public class quiz9 {
    public static void main(String[] args) {
        boolean done = false;
        Scanner input = new Scanner(System.in);
        do{
            int[] numArray = new int[3];
            System.out.println("Please type the first number");
            numArray[0] = input.nextInt();
            System.out.println("Please type the 2nd number");
            numArray[1] = input.nextInt();
            System.out.println("Please type the 3rd number");
            numArray[2] = input.nextInt();
            if (numArray[0] == numArray[1] && numArray[0] + numArray[1] == numArray[2]){
                System.out.println("you're genius");
                done = true;
            } else {
                System.out.println("nope. try again");
            }

        } while (!done);
    }
}
