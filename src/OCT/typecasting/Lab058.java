package OCT.typecasting;

public class Lab058 {
    public static void main(String[] args) {

        // Imagine a banking application where the total balance of a user is stored as a double,
        // but individual transactions are often represented as int values.

        int transactionAmount = 500;
        double totalBalance = 1500.75;

        // Widening: transactionAmount (int) is converted to double automatically
        double balance = totalBalance + transactionAmount;

        System.out.println("Updated Balance: " + totalBalance);


    }
}
