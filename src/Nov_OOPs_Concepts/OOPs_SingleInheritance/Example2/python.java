package Nov_OOPs_Concepts.OOPs_SingleInheritance.Example2;

public class python extends Programming{

    // extends is a

    void print(){
        System.out.println(version);
        System.out.println(author);
    }

    python (){
        System.out.println("DC");
    }

    public static void main(String[] args) {
        python P1 = new python();
        System.out.println(P1.author);
    }
}
