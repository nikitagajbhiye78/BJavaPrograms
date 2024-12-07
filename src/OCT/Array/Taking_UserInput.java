package OCT.Array;

import java.util.Scanner;

public class Taking_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number");
            numbers[i]= scanner.nextInt();
        }

        System.out.println("-----");
        // print the statements
        System.out.println("The numbers are:");
        for ( int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }



    }
}
