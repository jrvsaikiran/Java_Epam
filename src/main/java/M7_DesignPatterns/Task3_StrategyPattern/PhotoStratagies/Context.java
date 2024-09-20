package M7_DesignPatterns.Task3_StrategyPattern.PhotoStratagies;

public class Context {

    public Stratage_PhoneCameraApp strategy;

    public Context(Stratage_PhoneCameraApp strategy) {
        this.strategy = strategy;
    }

    public String getStrategy(String str) {
        return strategy.modeOfShare(str);
    }

}
