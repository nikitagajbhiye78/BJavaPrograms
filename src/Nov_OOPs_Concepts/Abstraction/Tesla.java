package Nov_OOPs_Concepts.Abstraction;

public class Tesla extends Engine {

    void driver(){
        startingtheEngine();
        stoppingtheEngine();
    }

    @Override
    void startingtheEngine() {
        System.out.println("Start electric engine");
    }

    @Override
    void stoppingtheEngine() {
        System.out.println("stop electric engine");
    }
}
