package OCT.Functions_examples;

public class lab03 {
    public static void main(String[] args) {
        //3. With Parameters and Without Return Type

        greet_with_first_name("Nikita");
        greet_with_first_name("Rony");

        greet_with_first_name_last_name("Nikita", "Gajbhiye");

    }
    static void greet_with_first_name (String name){
        System.out.println("Your name is " + name);
    }

    static void  greet_with_first_name_last_name (String firstname, String lastname){
        System.out.println("Your name is " + firstname +" "+ lastname);
    }

}
