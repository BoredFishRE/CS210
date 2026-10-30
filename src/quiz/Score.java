/*
Elliott Benson CS210
10/30/2026
This program will take in a file and then allow the user to access the data through the program.
access code trickortreat
 */
package quiz;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//Initalizes this for the ArrayList, allows more than one data type.
class student {
    String name;
    int mathscore;
    int physcore;
}
public class Score {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<student> studentList = new ArrayList<>();
        File scoreFile = new File("score.txt");
        Scanner scores = new Scanner(scoreFile);
        //Writes data to array from file.
        while(scores.hasNext()) {
            student studScore = new student();
            studScore.name = scores.next();
            studScore.mathscore = scores.nextInt();
            studScore.physcore = scores.nextInt();
            studentList.add(studScore);
        }
        //Need to initialize a new scanner so I can read user input. The previous one can only read from file.
        Scanner input = new Scanner(System.in);
        System.out.println("Select 1 for Math or 2 for Physics");
        int subSel = input.nextInt();
        //Calls the average subroutine.
        double averageScore = avgScore(studentList, subSel);
        //Runs depending on user input. If 1 is selected, it prints the math and physics scores for whoever is higher than the average math score. Same with 2 except for physics
        if (subSel == 1){
            System.out.print("The average for the math test is ");
            System.out.printf("%.2f", averageScore);
            System.out.println("The students with a higher than average score is");
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).mathscore > averageScore) {
                    System.out.println("Name: " + studentList.get(i).name + ", Math Score: " + studentList.get(i).mathscore + ", Physics Score: " + studentList.get(i).physcore);
                }
            }
        } else if (subSel == 2) {
            System.out.print("The average for the physics test is ");
            System.out.printf("%.2f", averageScore);
            System.out.println("The students with a higher than average score is");
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).physcore > averageScore) {
                    System.out.println("Name: " + studentList.get(i).name + ", Math Score: " + studentList.get(i).mathscore + ", Physics Score: " + studentList.get(i).physcore);
                }
            }
        }
    }
    public static double avgScore(ArrayList<student> studentList, int subSel){
        //Adds all the values of either the math score or physics score and divides it by array size, which gets us the average.
        double sum = 0;
        for(int i = 0; i < studentList.size(); i++){
            if (subSel == 1) {
                sum += studentList.get(i).mathscore;
            } else if (subSel == 2){
                sum += studentList.get(i).physcore;
            }
        }
        return sum / studentList.size();
    }
}
