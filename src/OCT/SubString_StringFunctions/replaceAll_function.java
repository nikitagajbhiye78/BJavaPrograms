package OCT.SubString_StringFunctions;

public class replaceAll_function {
    public static void main(String[] args) {

        // \\d corresponds to integer, \\s corresponds to string

        String SS = "Banana123";
        String Results = SS.replaceAll("\\d+", "");
        System.out.println(Results);

    }
}
