package OCT.Programs;

public class Argument_Console {
    public static void main(String[] args) {

        // Create a program where Rony will go to goa or not
        // Age>25 ---> drinking to goa
        // Use ternary operators

        // Used wrapper class and provided data in edit configuration
        int age = Integer.parseInt((args[0]));
        System.out.println(age > 25? "allowed to go goa" : "Not allowed to go goa");

    }
}
