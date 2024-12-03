package OCT;

import java.util.Scanner;

public class Task_23102024 {
    public static void main(String[] args) {

        //Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
        //3 → user input
        //4 - user input
        //sum(3,4)
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the num1");
        int num2 = scanner.nextInt();
        System.out.println("Enter the num1");

        int result= sum_of_two_number(num1,num2);
        System.out.println(result);

        int result_sub= sub_of_two_number(num1,num2);
        System.out.println(result_sub);

        int result_mul= mul_of_two_number(num1,num2);
        System.out.println(result_mul);
    }
       static int sum_of_two_number (int num1, int num2){
        return num1+num2;
    }
       static int sub_of_two_number (int num1, int num2) {
        return num1 - num2;
    }
       static int mul_of_two_number (int num1, int num2) {
        return num1 * num2;
    }

}
