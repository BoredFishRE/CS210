package practice;

import java.util.Scanner;

public class quiz1Rewrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean idTrue = false;
        System.out.println("Minimum id length:");
        int minLength = input.nextInt();
        System.out.println("Maximum id length:");
        int maxLength = input.nextInt();
        System.out.println("Minimum length: " + minLength + " Maximum length: " + maxLength);
        while(!idTrue){
            System.out.println("Please enter your new ID");
            String idName = input.next();
            int idLength = idName.length();
            char f = idName.charAt(0);
            char l = idName.charAt(idLength - 1);
            boolean checkOdd = idLength %2 ==1;
            if (idLength >= minLength && idLength <= maxLength && f != l && checkOdd) {
                System.out.println("ID Saved. Thank you!");
                idTrue = true;
            } else if (idLength < minLength && f == l && !checkOdd){
                System.out.println("ID Length too short");
                System.out.println("ID length must be odd");
                System.out.println("First and Last Letter cannot be the same.");
                System.out.println("Please Try Again");
            } else if (idLength > maxLength && f == l && !checkOdd){
                System.out.println("ID Length too long");
                System.out.println("ID length must be odd");
                System.out.println("First and Last Letter cannot be the same.");
                System.out.println("Please Try Again");
            } else if (idLength < minLength && !checkOdd){
                System.out.println("ID Length too short");
                System.out.println("ID length must be odd");
                System.out.println("Please Try Again");
            } else if (idLength > maxLength && !checkOdd){
                System.out.println("ID Length too long");
                System.out.println("ID length must be odd");
                System.out.println("Please Try Again");
            } else if (idLength < minLength) {
                System.out.println("ID Length too short");
                System.out.println("Please Try Again");
            } else if (idLength > maxLength) {
                System.out.println("ID Length too long");
                System.out.println("Please Try Again");
            } else if (f == l && !checkOdd){
                System.out.println("ID length must be odd");
                System.out.println("First and Last Letter cannot be the same.");
                System.out.println("Please Try Again");
            } else if (!checkOdd){
                System.out.println("ID length must be odd");
                System.out.println("Please Try Again");
            } else if (f == l){
                System.out.println("First and Last Letter cannot be the same.");
                System.out.println("Please Try Again");
            }
        }
    }
}
