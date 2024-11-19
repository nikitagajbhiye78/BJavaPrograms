package OCT.Ternary_Operators;

public class Ex_02 {
    public static void main(String[] args) {

        // Temperature status
        // 30 is falles under - hot
        // 20 is falles under - cold

        int a = 19;
        String results = (a>30)?"Hot" : (a<20)?"cold" : "Hot";
        System.out.println(results );


    }
}
