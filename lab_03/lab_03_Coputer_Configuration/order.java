public class order {
    private String Processor;
    private String Storage;
    private String Graphics_card;
    
    // order(string Processor, string Storage, string Graphics_card)

    public order setProcessor(String Processor){
        this.Processor = Processor;
        return this;
    }
    public order setStorage(String Storage){
        this.Storage = Storage;
        return this;
    }
    public order setGraphics_card(String Graphics_card){
        this.Graphics_card = Graphics_card;
        return this;
    }

    public String toString(){
        return "Processor = "+this.Processor + "\nStorage = "+this.Storage + "\nGraphics_card = "+this.Graphics_card + "\n";
    }
}
    

