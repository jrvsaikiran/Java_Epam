package M7_DesignPatterns.Task3_StrategyPattern.PhotoStratagies;

public class Test {
    public static void main(String[] args) {
        Context c = new Context(new EditPhoto());
        String strategy = c.getStrategy(EditPhoto.class.getSimpleName());
        System.out.println(strategy);

        Context c2 = new Context(new SavePhoto());
        String s = c2.strategy.modeOfShare(SavePhoto.class.getSimpleName());
        System.out.println(s);


    }
}
