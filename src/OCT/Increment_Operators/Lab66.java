package OCT.Increment_Operators;

public class Lab66 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(a++ + ++a);

        //A--> a++  --> 10   --> 11
        // +
        //B--> ++a --> 12  --> 12
        // output A+B= 10+12 = 22
    }
}
