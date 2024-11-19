package OCT.typecasting;

public class Lab062 {
    public static void main(String[] args) {

        long largeNumber = 12789595954858l;
        byte smallnumber = (byte)largeNumber;

        System.out.println("Original largeNumber:" +largeNumber);
        System.out.println("Narrowed smallNumber:" +smallnumber);

    }
}
