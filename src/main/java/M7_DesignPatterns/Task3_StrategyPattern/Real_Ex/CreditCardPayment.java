package M7_DesignPatterns.Task3_StrategyPattern.Real_Ex;

// Concrete strategy for credit card payment
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
