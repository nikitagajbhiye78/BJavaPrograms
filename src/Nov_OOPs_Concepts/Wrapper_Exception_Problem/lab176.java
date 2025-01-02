package Nov_OOPs_Concepts.Wrapper_Exception_Problem;

import java.io.FileInputStream;

public class lab176 {
    public static void main(String[] args) {

        // Checked exception
        // FileInputStream file = new FileInputStream("https://a.text");
        // jvm knows this may lead to file not exception error

        // unchecked exception - jvm doesnt know it
        // will get number format exception
        int a = 100;
        int b = 10;
        b= 30;
        int c= b/100;
        System.out.println(c);
        //
    }
}
