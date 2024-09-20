package M7_DesignPatterns.Task3_StrategyPattern.Real_Ex;

public class DebitCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;
    public DebitCardPayment(String cardNumber, String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Debit card.");
    }
}
