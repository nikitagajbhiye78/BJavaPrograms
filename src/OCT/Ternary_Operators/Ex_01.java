package OCT.Ternary_Operators;

public class Ex_01 {
    public static void main(String[] args) {
        // Find smallest numbers

        int a= 5,b= 10, c= 12;
        int results = (a<b && b<c? a:b<c? b:c);
        System.out.println(results );

    }
}
