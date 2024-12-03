package OCT.Switch_loops;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        // Taking inputs from user
        System.out.println("Enter the first number");
        double num1 = SC.nextDouble();

        System.out.println("Enter the second number");
        double num2 = SC.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = SC.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1 + "+" +num2 + "=" + (num1+num2));
                break;

            case '-':
                System.out.println(num1 + "-" +num2 + "=" + (num1-num2));
                break;

            case '*':
                System.out.println(num1 + "*" +num2 + "=" + (num1*num2));
                break;

        }
    }
}
