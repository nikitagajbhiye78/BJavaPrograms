package Nov_OOPs_Concepts.Wrapper_Exception_Problem;

public class Lab177_HowToHandleException {
    public static void main(String[] args) {

        // USE try catch to handle exception
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
