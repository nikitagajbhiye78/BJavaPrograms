package OCT;

public class Operator_Practics3 {
    public static void main(String[] args) {

        // Using Char data types
        char a1= 'A'; // ASCII-> 65
        char b1= 'B'; // 66

        //Rules - Cancentination of char - int calculations
        //a1+b1= 65+66=131

        System.out.println(a1+b1);

        // we can print char
        System.out.println('A'== b1);
        // it will behave as 65==66, output will be "False"

        short i=30;
        char j= 'B';
        System.out.println(i+j); // if we add + operator, concantination weill done 30+66

    }
}
