package M7_DesignPatterns.Task3_StrategyPattern.PhotoStratagies;

public class SavePhoto implements Stratage_PhoneCameraApp {
    @Override
    public String modeOfShare(String mode) {
        return mode;
    }
}
