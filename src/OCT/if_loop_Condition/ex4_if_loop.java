package OCT.if_loop_Condition;

import java.util.Scanner;

public class ex4_if_loop {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int num1 = SC.nextInt();
        System.out.println("Enter the Num1");
        int num2 = SC.nextInt();
        System.out.println("Enter the Num2");
        // Condition - 2 inputs
        // Rough logic num1>num2 or num2>num1 or num1==num2

         if (num1>num2){
             System.out.println("Num1 > Num2");
         }
        else if (num2>num1) {
             System.out.println("Num2 > Num1");
        }
        else {
             System.out.println("Equal");
         }
       SC.close();
    }
}
