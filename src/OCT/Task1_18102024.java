package OCT;

import java.util.Scanner;

public class Task1_18102024 {
    public static void main(String[] args) {

        //Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.
        Scanner SC= new Scanner(System.in);
        System.out.println("1- add 2- substraction 3- multiplication 4- divison 5- modus");

        System.out.println("Enter num1");
        int num1 = SC.nextInt();

        System.out.println("Enter num2");
        int num2 = SC.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = SC.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;
            default:
                System.out.println("Wrong number");
        }
      SC.close();
    }
}
