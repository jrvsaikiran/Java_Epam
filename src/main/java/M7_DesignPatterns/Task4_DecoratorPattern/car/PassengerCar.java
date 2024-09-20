package M7_DesignPatterns.Task4_DecoratorPattern.car;

public class PassengerCar extends Decorator {

    public PassengerCar(Car car) {
        super(car);
    }


    @Override
    public void design() {
        super.design();
        System.out.print("PassengerCar design");

    }

}
