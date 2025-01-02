package Nov_OOPs_Concepts.SuperKeywords;

public class Labex155 {
    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}
class car extends vehical{
   private int maxspeed = 280;

   // methodOverriding

    @Override
    void display() {
        System.out.println("child");
    }

 // Created parameterize constructor
    car (){
        super();
        System.out.println("DC");
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);
    }
}

class vehical{
 // if we are using super so need to covert private into public
    public int maxspeed = 100;

void display(){
    System.out.println("Parent");
}
 vehical(){
     System.out.println("DC--Vehical");
 }
    vehical(int a){
        System.out.println("PC--Vehical");
    }
    void message (){
        System.out.println("CC--Vehical");
    }
    void message ( int c){
        System.out.println(" Hello Vehical");
    }
}


