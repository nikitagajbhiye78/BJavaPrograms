package OCT.Array;

import java.util.Scanner;

public class Reverse_2DArray {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the size n=5");
        int n = SC.nextInt();

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



