package OCT.Ternary_Operators;

public class Ex_03 {
    public static void main(String[] args) {

        // smallest number
        int a = 45, b=40, c= 45;
        int results =  a<b & b<a? a: b<c? b:c;

        System.out.println("Find smallest number:" +results);


    }
}
