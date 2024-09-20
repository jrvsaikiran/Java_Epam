package M7_DesignPatterns.Task3_StrategyPattern.Real_Ex;

// Concrete strategy for PayPal payment
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
