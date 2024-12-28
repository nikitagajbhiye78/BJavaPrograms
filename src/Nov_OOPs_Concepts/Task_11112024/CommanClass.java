package Nov_OOPs_Concepts.Task_11112024;

public class CommanClass {

    private String broswer;

     CommanClass (){
         System.out.println("DC---CC");
     }

    public CommanClass(String broswer) {
        this.broswer = broswer;
    }

    public String getBroswer() {
        return broswer;
    }

    public void setBroswer(String broswer) {
        this.broswer = broswer;
    }

    public void SetBroswer(String broswer, boolean isAuth) {
        if (isAuth) {
            this.broswer = broswer;
        }
        else {
            System.out.println("notAllowed");
        }
    }
    void OpenBrowser(){
        System.out.println("Chrome ");
    }
     void CloseBroswer(String broswer){
        System.out.println("CloseBroswer !!");
    }

}
