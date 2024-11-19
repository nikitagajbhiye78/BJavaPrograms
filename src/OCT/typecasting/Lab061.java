package OCT.typecasting;

public class Lab061 {
    public static void main(String[] args) {

        //Ex of Narrowing casting
        // Convert a long timestamp to an int for logging purposes.

        long timestaps = System.currentTimeMillis();
        int smalltimeStaps = (int)timestaps;

        System.out.println("long original timestaps:" +timestaps);
        System.out.println("int smalltimeStaps:" +smalltimeStaps);

    }
}
