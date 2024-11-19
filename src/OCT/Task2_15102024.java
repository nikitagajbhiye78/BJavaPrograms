package OCT;

public class Task2_15102024 {
    public static void main(String[] args) {

        // Find maximum/ largest number a,b,c by using ternary operator (: else)

        int a=100;
        int b=200;
        int c=500;
        int max= a>b && b>c? a:b>c? b:c;
        System.out.println(max);

    }
}
