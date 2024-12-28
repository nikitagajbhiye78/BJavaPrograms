package Nov_OOPs_Concepts.RealEx;

public class BaseClass {
     private String broswer;

    BaseClass() {
        System.out.println("DC- Base class");
    }
     BaseClass(String broswer) {
         System.out.println("CC- Base class");
    }
    public String getBroswer() {
        return broswer;
    }
    public void setBroswer(String broswer) {
        this.broswer = broswer;
    }
    void openbroswer(String broswer){
     System.out.println("openbroswer");
    }
    void closebrowser(){
         System.out.println("closebrowser");
    }
}

