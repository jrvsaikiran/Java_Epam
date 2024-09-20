package M7_DesignPatterns.Task3_StrategyPattern.PhotoStratagies;

public class TakePhoto implements Stratage_PhoneCameraApp {
    @Override
    public String modeOfShare(String mode) {
        return mode;
    }
}
