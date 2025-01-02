package Nov_OOPs_Concepts.Static_Keyword;

public class Ex_162 {
    public static void main(String[] args) {
        automation t1 = new automation();
        automation t2 = new automation();
        System.out.println(t1.driver);
        System.out.println(t2.driver);
    }
}

class automation{
     static String driver = "Chrome";
}
