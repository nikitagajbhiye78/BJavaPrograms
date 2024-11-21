package OCT.Programs;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Scanner class
        // Create a program where Rony will go to goa or not
        // Age>25 ---> drinking to goa
        // Use ternary operators

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age = scanner.nextInt();
        System.out.println( age>25? "Allowed to go goa" : " Not allowed to go goa");

        scanner.close();
    }
}
