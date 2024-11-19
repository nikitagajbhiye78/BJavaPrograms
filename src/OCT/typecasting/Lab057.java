package OCT.typecasting;

public class
Lab057 {
    public static void main(String[] args) {
        //Typecasting
        //Widening - converting data small to large  -> implicit, explicit -- lossless
        //Narrowing - converting data large to small -> implicit, explicit -- with data types

        //Ex of widening
        byte a = 10;
        int b = a;   // valid-- implicit casting- jvm
        int var = (int)b; // valid-- explicit casting- jvm

        //Ex of narrowing
        int b1 = 30;
        // byte a2 = b1; --> invalid implicit - jvm
        byte a3 = (byte)b1; // valid explicit - user



    }
}
