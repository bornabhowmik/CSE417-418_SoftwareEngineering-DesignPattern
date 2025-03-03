package lab_06.task_02;

interface PaymentStrategy {
    public int pay(int money);
}

class CreditCardPayment implements PaymentStrategy {
    public int pay(int money) {
        return money;
    }
}
class BkashPayment implements PaymentStrategy {
    public int pay(int money) {
        return money;
    }
}
class CashOnDelivery implements PaymentStrategy {
    public int pay(int money) {
        return money;
    }
}

class Context {
    private PaymentStrategy payment_Strategy;

    public Context(PaymentStrategy payment_Strategy) {
        this.payment_Strategy = payment_Strategy;
    }

    public int doPayment(int money) {
        return payment_Strategy.pay(money);
    }
}

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new CreditCardPayment());
        System.out.println("Paid with CashOnDelivery " + context.doPayment(10000));
    }
}
