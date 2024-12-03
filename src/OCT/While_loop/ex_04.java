package OCT.While_loop;

public class ex_04 {
    public static void main(String[] args) {

        // Two ways
        // 1. argumnets
        // 2. scannerclass

        // Take user input for age and print the output

      int age = Integer.parseInt(args [0]);
      while (age> 0){
          System.out.println(age);
          age--;
      }

    }
}
