package M7_DesignPatterns.Task4_DecoratorPattern.Exam;

public class LuxaryCar extends Decorater{
    public LuxaryCar(Car car) {
        super(car);
    }

    @Override
    public void design() {
        System.out.println("Luxary Car");
        super.design();
    }
}
