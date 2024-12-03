package OCT;
import java.util.Scanner;

public class Task1_17102024 {
    public static void main(String[] args) {
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        Scanner SC = new Scanner(System.in);
        int score = SC.nextInt();
        System.out.println("Enter the grade");

        if (score >= 90 && score<=100){
            System.out.println("You will get: +A");
        }
        else if (score >=80 && score<=89) {
            System.out.println("You will get: +B");
        }
        else if (score >=70 && score<=79) {
            System.out.println("You will get: +C");
        }
        else if (score >=60 && score<=69) {
            System.out.println("You will get: +D");
        }
        else if (score >=0 && score<=59)
        {
            System.out.println("You will get: +E");
        }
        else {
            System.out.println("You got failed");
        }
        SC.close();
    }
}
