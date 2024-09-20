package M7_DesignPatterns.Task4_DecoratorPattern.webpage;

public class Test {
    public static void main(String[] args) {

        int design = new Decorator(new BasicVersion()).design();
        System.out.println(design);

        int design1 = new Decorator(new WidgetsCalculator(new BasicVersion())).design();
        System.out.println(design1);


    }
}
