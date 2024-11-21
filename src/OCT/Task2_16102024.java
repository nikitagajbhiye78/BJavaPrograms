package OCT;

public class Task2_16102024 {
    public static void main(String[] args) {

        // Take a user input 2 numbers from the arguments and calculate the maximum in ternary operator

        int a = Integer.parseInt((args[0]));
        int b = Integer.parseInt((args[1]));
        System.out.println(a > b? a: b>a?b :a);

    }
}
