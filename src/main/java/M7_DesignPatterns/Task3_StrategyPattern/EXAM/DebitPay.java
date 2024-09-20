package M7_DesignPatterns.Task3_StrategyPattern.EXAM;

public class DebitPay implements Payments {
    int account;

    public DebitPay(int amount) {
        this.account = amount;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Debit payment of " + amount + " to this account " + this.account);
    }
}
