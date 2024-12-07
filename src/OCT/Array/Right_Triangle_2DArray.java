package OCT.Array;

import java.util.Scanner;

public class Right_Triangle_2DArray {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int n = SC.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
