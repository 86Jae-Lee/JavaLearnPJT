package JavaStudy_Interface_ect;

public class Car_Test {
    public static void main(String[] args) {

    }
}

interface Vehicle {
    void move();
}

abstract class CarTest {
    public abstract void run();
    public void stop() {
        System.out.println("Car stop");
    }
}
class SportsCar extends CarTest{
    @Override
    public void run() {


    }

    @Override
    public void stop() {
        super.stop();
    }
}