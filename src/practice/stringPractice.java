package practice;
import java.util.*;
public class stringPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean done = false;
        while (!done){
            System.out.println("Input first number:");
            int firstNum = input.nextInt();
            System.out.println("Input second number:");
            int secondNum = input.nextInt();
            System.out.println("Input final number:");
            int thirdNum = input.nextInt();
            if ((firstNum != secondNum) && (firstNum+secondNum < thirdNum)){
                System.out.println("You are smart!!");
            }
        }
    }
}
