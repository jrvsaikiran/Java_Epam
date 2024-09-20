package M7_DesignPatterns.Task4_DecoratorPattern.webpage;

public class Decorator implements DesktopVersion {

    private DesktopVersion desktopVersion;

    public Decorator(DesktopVersion desktopVersion) {

        this.desktopVersion = desktopVersion;
    }
    @Override
    public int design() {
        int design = this.desktopVersion.design();

        return 1+design;
    }
}
