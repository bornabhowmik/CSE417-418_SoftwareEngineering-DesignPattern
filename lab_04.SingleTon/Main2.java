public class Main2 {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        db1.disconnect();
        db2.disconnect();
    }
}