// Strategy Design Pattern Example - Payment System
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategy: Credit Card Payment
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}

// Concrete Strategy: PayPal Payment
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}

// Concrete Strategy: Bitcoin Payment
class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Bitcoin Wallet: " + walletAddress);
    }
}

// Context Class: Manages Payment Strategy
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

// Main Class: Testing the Strategy Pattern
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card Payment
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.makePayment(100);

        // Using PayPal Payment
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(200);

        // Using Bitcoin Payment
        context.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F"));
        context.makePayment(300);
    }
}
