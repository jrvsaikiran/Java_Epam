package M7_DesignPatterns.Task5_BuilderPattern;

public class Test {
    public static void main(String[] args) {

        BuildPatern build = BuildPatern.builder().setGears("gear").setCarrier("carriers").setDoubleStands("double stand")
                .setDoubleSeats("double seats").build();

        System.out.println(build);

        System.out.println(build.getGears()+" & "+build.getDoubleSeats()+" & "+build.getDoubleStands());


    }
}
