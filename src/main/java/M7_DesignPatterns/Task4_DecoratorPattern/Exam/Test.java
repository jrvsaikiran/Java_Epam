package M7_DesignPatterns.Task4_DecoratorPattern.Exam;

import M7_DesignPatterns.Task4_DecoratorPattern.car.Decorator;

public class Test {
    public static void main(String[] args) {

//         new SuperCar(new BasicCar()).design();
         new LuxaryCar(new SuperCar(new BasicCar())).design();

    }
}
