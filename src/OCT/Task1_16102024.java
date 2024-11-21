package OCT;

import java.util.Scanner;

public class Task1_16102024 {
    public static void main(String[] args) {

        // Take a user input name, age, salary and print then at end

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = Sc.nextLine();

        System.out.println("Enter the age");
        int age = Sc.nextInt();

        System.out.println("Enter the salary");
        double salary = Sc.nextDouble();

        // Displayed all details
        System.out.println("\nYour Details:");
        System.out.println("name:" +name);
        System.out.println("age:" +age);
        System.out.println("salary:" +salary);

        // Close the scanner
        Sc.close();
    }
}
