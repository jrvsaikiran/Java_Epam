package M7_DesignPatterns.Task4_DecoratorPattern.webpage;

public class WidgetsCalculator extends Decorator {
    public WidgetsCalculator(DesktopVersion desktopVersion) {
        super(desktopVersion);
    }

    @Override
    public int design(){
        int design = super.design();
        System.out.println(" : widgetsCalculator design : " );
        return 2+design;
    }
}
