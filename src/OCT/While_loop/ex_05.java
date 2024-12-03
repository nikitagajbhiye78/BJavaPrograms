package OCT.While_loop;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a positive number: "); // Prompt the user for input

        int age = scanner.nextInt(); // Read the input

        // Check if the input is valid
        if (age > 0) {
            while (age > 0) {
                System.out.println(age); // Print the current value of age
                age--; // Decrement age
            }
        } else {
            System.out.println("Please enter a positive number."); // Error message for invalid input
        }

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}
