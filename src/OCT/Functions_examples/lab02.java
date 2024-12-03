package OCT.Functions_examples;

public class lab02 {
    public static void main(String[] args) {

        //2. Without Parameters but With Return Type

       String returned_value =  greet_first_hello();
        System.out.println(returned_value);


        int voting_age = greet_two_num();
        System.out.println(voting_age);
        if (voting_age>= 18) {
            System.out.println(" you are allowed to vote");
        }
        else {
            System.out.println(" you are not allowed to vote");
        }

    }

    static String greet_first_hello (){
     // write code
        System.out.println("Hi, i am type 2");
        return "Hi, you are osm";

    }
    // 2nd type
    static int greet_two_num(){
        System.out.println("Can i vote?");
        return 18;
    }


}
