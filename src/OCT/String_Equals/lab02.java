package OCT.String_Equals;

public class lab02 {
    public static void main(String[] args) {

        String s1 = "Nikita"; //SCP
        String s2 = "Nikita"; //SCP
        String s3 = "Nikita";


        String S5 = new String("Hello");
        String S6 = new String("Hello");
        String S7 = new String("Hello");

        // if we use "==" comparison operator/ true or false operator

        System.out.println(s1==s2);
        System.out.println(s2==S5);
        System.out.println(s3==S5);
        System.out.println(s1==S7);
        System.out.println(s1==S6);

    }
}
