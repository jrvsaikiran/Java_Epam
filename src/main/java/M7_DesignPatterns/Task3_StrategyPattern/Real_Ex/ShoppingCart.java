package M7_DesignPatterns.Task3_StrategyPattern.Real_Ex;

// Context class
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    // Set the payment strategy at runtime
    public  void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}