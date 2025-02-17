

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order.Builder()
                .setProcessor("i3")
                .setStorage("8/256")
                .setGraphicsCard("NVIDIA")
                .build();

        System.out.println("Order 1 Info:\n" + order1);

        Order order2 = new Order.Builder()
                .setProcessor("AMD Ryzen")
                .setStorage("16/512")
                .setGraphicsCard("AMD")
                .build();

        System.out.println("Order 2 Info:\n" + order2);
    }
}
