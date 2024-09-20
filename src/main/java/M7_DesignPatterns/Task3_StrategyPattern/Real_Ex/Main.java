package M7_DesignPatterns.Task3_StrategyPattern.Real_Ex;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        // Pay with a credit card
        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456", "John Doe"));
        cart.checkout(100);

        // Pay with PayPal
        cart.setPaymentStrategy(new PayPalPayment("john@example.com", "mypassword"));
        cart.checkout(200);

        // Pay with PayPal
        cart.setPaymentStrategy(new DebitCardPayment("john@example.com", "mypassword"));
        cart.checkout(300);
    }
}
