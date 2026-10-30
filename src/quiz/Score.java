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
class student {
    String name;
    int mathscore;
    int physcore;
}
public class Score {
    public static ArrayList<student> studentList = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException{
        File scoreFile = new File("/Users/boredfish/score.txt");
        Scanner scores = new Scanner(scoreFile);
        student studentScore = new student();
        while(scores.hasNext()) {
            studentScore.name = scores.next();
            System.out.println(studentScore.name);
            studentList. = scores.nextInt();
            studentScore.physcore = scores.nextInt();
            studentList.add(studentScore);
        }
        System.out.println(studentList);
    }
}
