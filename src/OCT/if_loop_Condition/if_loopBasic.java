package OCT.if_loop_Condition;

import java.util.Scanner;

public class if_loopBasic {
    public static void main(String[] args) {

        // age>20 only can vote-- Used argument console and if else loop

        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();

        if (age>20)
        {
            System.out.println("Votting allowed");
        }
else
        {
            System.out.println("Not allowed to vote");
        }
    sc.close();
    }
}
