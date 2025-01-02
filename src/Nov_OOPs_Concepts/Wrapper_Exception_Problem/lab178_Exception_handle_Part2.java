package Nov_OOPs_Concepts.Wrapper_Exception_Problem;

public class lab178_Exception_handle_Part2 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = c/10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
