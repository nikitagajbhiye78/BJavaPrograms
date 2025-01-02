package Nov_OOPs_Concepts.Abstraction;

public class lab156 {
    public static void main(String[] args) {
        child c = new child();
        c.loan25k();
        c.loan50k();
    }
}

 class child extends father {

     @Override
     void loan25k() {
         System.out.println("25k paid by child");
     }
 }

 abstract class father{
  abstract  void loan25k();
         void loan50k (){
             System.out.println("50k done by father");
         }
}


