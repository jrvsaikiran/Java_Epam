package M7_DesignPatterns.Task4_DecoratorPattern.car;

public class Test {
    public static void main(String[] args) {

        new LuxuryCar(new PassengerCar(new BasicCar())).design();
        new BasicCar().design();
    }
}
