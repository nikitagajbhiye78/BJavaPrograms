package Nov_OOPs_Concepts.Wrapper_Exception_Problem;

public class lab177 {
    public static void main(String[] args) {

        System.out.println("Start");
        String s1 = null;
        s1.trim();    // this line will get NullPointerException
        System.out.println("End");

    }
}
