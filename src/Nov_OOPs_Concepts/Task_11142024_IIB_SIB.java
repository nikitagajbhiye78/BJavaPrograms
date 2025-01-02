package Nov_OOPs_Concepts;

public class Task_11142024_IIB_SIB {
    public static void main(String[] args) {
       ATB B1 = new ATB();
       B1.getName();
       ATB B2 = new ATB();
       B2.getName();
       System.out.println(ATB.Automation_Course);
       ATB.Automation_Course = "Automation Blueprint";
       System.out.println(ATB.Automation_Course);
    }
}

class ATB {
   private String name;
   private int fees;
   static String Automation_Course = "XYZ";

    {
       System.out.println("IIB");
       System.out.println("Reading the database files");
    }

  static   {
      System.out.println("SIB");
      System.out.println("Number of course enrollment");
    }

    public ATB() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    void readingFile(){
        System.out.println("Non static functions");
        System.out.println(Automation_Course);
    }
    static void readingData(){
        System.out.println("static functions");
    }

}

