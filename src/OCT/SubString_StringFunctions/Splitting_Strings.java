package OCT.SubString_StringFunctions;

public class Splitting_Strings {
    public static void main(String[] args) {

        // We can split String into an array of substring based on Delimeter.

        String fruits = "Apple,Orange,Lemon";
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

      // Split by "_"

        String SS = "abc-qwt-opq";
        String[] split_SS = SS.split("_");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

    }
}
