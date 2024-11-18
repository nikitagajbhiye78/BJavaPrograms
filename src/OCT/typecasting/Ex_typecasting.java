package OCT.typecasting;

public class Ex_typecasting {
    public static void main(String[] args) {

        int savings = 5000; // in dollars
        float interestRate = 2.5f; // in percentage
        float totalBalance = savings + interestRate;  // Widening implicit casting

        double price = 400;
       // int saving = price;
        int saving= (int)price; // Narrowing explicit casting


    }
}
