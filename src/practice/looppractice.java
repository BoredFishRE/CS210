package practice;

import java.util.*;

public class looppractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean made = false;
        while (!made) {
            try {
                System.out.println("Enter a number lower than 0");
                int num = input.nextInt();
                if (num < 0) {
                    System.out.println("You are a math genius!!!! :)");
                    made = true;
                } else {
                    System.out.println("Nope, not quite. Try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not a number! Try again.");
                input.nextLine();
            }
        }
    }
}
