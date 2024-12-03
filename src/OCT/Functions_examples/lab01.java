package OCT.Functions_examples;

public class lab01 {
    public static void main(String[] args) {
        // User Defined Functions
        //1. Without Parameters and Without Return Type.
        //2. Without Parameters but With Return Type
        //3. With Parameters and Without Return Type
        //4. With Parameters and With Return Type

        greet();

     // If we wanna print 100 times
     for ( int a=0; a<100; a++){
         greet();
        }

    }
    //1. Without Parameters and Without Return Type
     static void greet(){
        System.out.println("Hi, How are you");
     }

}
