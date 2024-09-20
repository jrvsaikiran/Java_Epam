package M7_DesignPatterns.Task4_DecoratorPattern.Exam;

public class SuperCar extends Decorater{
    public SuperCar(Car car) {
        super(car);
    }

    @Override
    public void design(){
        super.design();
        System.out.println("Super Car");
    }
}
