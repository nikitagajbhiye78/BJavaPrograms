package Nov_OOPs_Concepts.Wrapper_Exception_Problem;

public class lab175_Example {
    public static void main(String[] args) {
        // Exception we can handles
        // Error we cant not handle
        System.out.println("Start of the program");
        String A = args[0];  //ArrayIndexOutOfBoundsException
        int B = Integer.parseInt(A); //NumberFormatException
        int C = 1000/B;              //ArithmeticException
        System.out.println(C);
        System.out.println("End of the program");
    }
}
