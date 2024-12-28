package Nov_OOPs_Concepts.Polymorphism;

public class Methodoverloading {
    public void main(String[] args) {


        Mathsoperation mathsoperations = new Mathsoperation();
        int results= mathsoperations.add(3,7);  // depends on funtion type data will be executed
        System.out.println(results);
    }
    class Mathsoperation{

        //Definition:
        //This occurs when two or more methods in the same class have the same name but different
        //parameter lists. The method to be invoked is determined at compile-time.

        int add(int a, int b){
            return a+b;
        }
       //differnt data types with two arguments
        float add(float a, float b){
            return a+b;
        }
        double add(double a, double b, double c){
            return a+b;
        }
    }
}
