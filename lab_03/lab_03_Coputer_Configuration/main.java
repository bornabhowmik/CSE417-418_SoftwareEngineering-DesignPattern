public class main {
    public static void main(String args[]){
        order order1 = new order();

        order1.setProcessor("i3")
                .setStorage("8/256")
                .setGraphics_card("NVIDA");
        
        order order2 = new order();

        order2.setProcessor("AMD Ryzan")
                .setStorage("16/512")
                .setGraphics_card("AMD");
    

        System.out.println("Order 1 Info:\n" + order1.toString());
        System.out.println("Order 2 Info:\n" + order2.toString());
    }

    
}