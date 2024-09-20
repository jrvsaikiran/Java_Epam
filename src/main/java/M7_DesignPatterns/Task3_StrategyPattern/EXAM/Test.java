package M7_DesignPatterns.Task3_StrategyPattern.EXAM;

public class Test {
    public static void main(String[] args) {

        StratagyPay stratagyPay = new StratagyPay(new DebitPay(32343324));
        stratagyPay.pay(200);
    }
}
