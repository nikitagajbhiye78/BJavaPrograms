package OCT;

import java.util.Scanner;

public class Task2_17102024 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the sides of 1:");
        double side1 = SC.nextDouble();
        System.out.println("Enter the sides of 2:");
        double side2 = SC.nextDouble();
        System.out.println("Enter the sides of 3:");
        double side3 = SC.nextDouble();

if (side1<0 || side2 <0 || side2<0){
    System.out.println("Invalid input: Side lenght must be positive");
}
else if (side1==side2 && side2 ==side3 && side1==side3){
    System.out.println("The tringle is equilateral");
}
else if (side1==side2 || side2 ==side3 || side1==side3){
    System.out.println("The tringle is isosceles");
}
else {
    System.out.println("The tringle is scalene");
}
SC.close();
    }
}
