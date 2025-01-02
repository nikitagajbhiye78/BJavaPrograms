package Nov_OOPs_Concepts.Static_Keyword;

public class EX_SIB_IIB_161 {
    public static void main(String[] args) {
    nik a = new nik();
    // once object is created then, IIB & SIB will be executed
    }
}

class nik {
    {
        System.out.println("IIB");
    }
   static  {
        System.out.println("SIB");
    }
}
