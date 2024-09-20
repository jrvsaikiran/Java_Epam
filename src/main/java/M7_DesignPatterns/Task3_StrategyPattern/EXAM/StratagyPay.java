package M7_DesignPatterns.Task3_StrategyPattern.EXAM;

public class StratagyPay {
    Payments payments;
    public StratagyPay(Payments payments) {
        this.payments = payments;
    }

    public void pay(int amount) {
        payments.pay(amount);
    }
}
