package M7_DesignPatterns.Task4_DecoratorPattern.webpage;

public class WidgetsClock extends Decorator {

    public WidgetsClock(DesktopVersion desktopVersion) {
        super(desktopVersion);
    }


    @Override
    public int design() {
        super.design();
        System.out.print(" :widgetsClock design: ");

        return 3;
    }

}
