package Nov_OOPs_Concepts.Polymorphism;

public class Methodoverriding {
    public  void main(String[] args) {

        //Definition:
        //This occurs when a subclass provides a specific implementation for a method already defined
        //in its superclass. The method to be invoked is determined at runtime based on the object's type.

        daughter d1 = new daughter();
        d1.home();
        d1.home2();
    }

    //1.The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
    //2.The subclass method overrides the superclass method.

    class father {
        void home(){
        System.out.println("2bhk");
        }
        void f2(){}
    }

    class daughter extends father {
       //@Override
        void home2(){
            System.out.println("3bhk");
        }
        void f3(){}
    }


}


