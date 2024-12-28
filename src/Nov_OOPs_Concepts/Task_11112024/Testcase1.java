package Nov_OOPs_Concepts.Task_11112024;

public class Testcase1 extends CommanClass{
    public Testcase1() {
         System.out.println("Tc1");
    }

    public void StartBroswer(){
     OpenBrowser();
    }

    @Override
    public void SetBroswer(String broswer, boolean isAuth) {
        System.out.println("Own logic");
        super.SetBroswer(broswer, isAuth);
    }
}
