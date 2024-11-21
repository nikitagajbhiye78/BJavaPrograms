package OCT.if_loop_Condition;

import java.util.Scanner;

public class ex3_if_loop {
    public static void main(String[] args) {

        // find odd and even number by using scanner class & if else loop
        // Moduls
        // 10%2 -- even--0
        // 10%2 -- odd--1
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
       sc.close();
    }
}
