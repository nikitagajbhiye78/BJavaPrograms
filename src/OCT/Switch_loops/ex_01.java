package OCT.Switch_loops;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        // Switch condition
        // Enter days from 1 to 7
        // what day it is it

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter all the days from 1-7");
        int days = SC.nextInt();

       switch (days){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wendsday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("No idea what day would be");
               break;
       }

            SC.close();
    }
}
