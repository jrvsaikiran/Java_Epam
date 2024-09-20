package M7_DesignPatterns.Task4_DecoratorPattern.Exam;

public class Decorater implements Car{
private Car car;
    public Decorater(Car car) {
      this.car = car;
    }


    @Override
    public void design() {
        car.design();
    }
}
