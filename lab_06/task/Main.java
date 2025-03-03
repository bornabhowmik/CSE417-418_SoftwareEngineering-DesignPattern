package lab_06.task;

interface Strategy {
    public int performOperation(int a, int b);
}

class Addition implements Strategy {
    public int performOperation(int a, int b) {
        return a + b;
    }
}

class Multiplication implements Strategy {
    public int performOperation(int a, int b) {
        return a * b;
    }
}
class Subtraction implements Strategy {
    public int performOperation(int a, int b) {
        return a - b;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doStrategy(int a, int b) {
        return strategy.performOperation(a, b);
    }
}

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("Additon: " + context.doStrategy(30, 20));

        context = new Context(new Multiplication());

        System.out.println("Multiplication: " + context.doStrategy(30, 20));
    }
}
