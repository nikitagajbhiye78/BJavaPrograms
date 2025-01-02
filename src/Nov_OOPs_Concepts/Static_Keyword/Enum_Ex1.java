package Nov_OOPs_Concepts.Static_Keyword;

public class Enum_Ex1 {
    public static void main(String[] args) {

        //Main method for both examples
        System.out.println(Enum_ex2_1.BASE_URL.getValue());

        System.out.println(Enum_Ex2.RED.getValue());
        if (Enum_Ex2.BLUE.getValue() == "3377FF" ) {
            System.out.println("The color is blue");
        }
    }
}
