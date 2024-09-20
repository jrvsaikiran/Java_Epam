package M7_DesignPatterns.Task4_DecoratorPattern.car;

public class LuxuryCar extends Decorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void design(){
        super.design();
        System.out.println("Luxury Car");
    }
}
