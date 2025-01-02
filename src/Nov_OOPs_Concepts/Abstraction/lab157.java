package Nov_OOPs_Concepts.Abstraction;

public class lab157 {

    public static void main(String[] args) {

        wangonR R = new wangonR();
        R.driver();

        Tesla t = new Tesla();
        t.driver();

    }
}

class wangonR extends Engine{

    void driver (){
        startingtheEngine();
        stoppingtheEngine();
    }

    @Override
    void startingtheEngine() {
        System.out.println("startingtheEngine");
    }

    @Override
    void stoppingtheEngine() {
        System.out.println("stoppingtheEngine");
    }
}

abstract class Engine {
   abstract void startingtheEngine();
    abstract void stoppingtheEngine();
}

