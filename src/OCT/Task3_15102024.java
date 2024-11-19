package OCT;

public class Task3_15102024 {
    public static void main(String[] args) {

        int a= 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // A--> ++a-->11 --> a= 11
        // B--> 11---> a= 12
        // c--> 12 -- a= 13
        // 11+11+12= 34
    }
}
