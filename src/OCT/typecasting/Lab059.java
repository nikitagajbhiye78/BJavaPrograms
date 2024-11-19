package OCT.typecasting;

public class Lab059 {
    public static void main(String[] args) {

        // Ex Widening
        // A restaurant calculates the total bill by adding a base price (integer) and taxes (float).
         int baseprice = 250;
         float taxes = 18.45F;
        taxes= taxes + baseprice;
        System.out.println("total bill:" +taxes);

    }
}
