package Nov_OOPs_Concepts.WrapperClass;

public class lab02 {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // Boxing - int --> Integer
        System.out.println(Integer.MAX_VALUE); //attributes
        System.out.println(Integer.MIN_VALUE); //attributes
        System.out.println(b.intValue());  // behaviour
        b.intValue();

       Integer a1 = 100;
       int b1 = a1;  // Unboxing - Integer -->int
        System.out.println(b1); // if we covert bugger one to shorter we will loose all the attributes & behaviour

    }
}
