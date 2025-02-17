final class order {
    private final String processor;
    private final String storage;
    private final String graphicsCard;

    private order(Builder builder) {
        this.processor = builder.processor;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    public static class Builder {
        private String processor;
        private String storage;
        private String graphicsCard;

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public order build() {
            return new order(this);
        }
    }

    @Override
    public String toString() {
        return "Processor = " + this.processor + "\nStorage = " + this.storage + "\nGraphics Card = " + this.graphicsCard + "\n";
    }
}
    

