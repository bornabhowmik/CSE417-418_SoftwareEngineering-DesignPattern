package Lab_4.DatabaseTask;

class DatabaseConnection {
    private static DatabaseConnection instance;
    private boolean isConnected = false;

    private DatabaseConnection() {}

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        if (isConnected) {
            System.out.println("Already connected!");
        } else {
            isConnected = true;
            System.out.println("Connected to the database!");
        }
    }

    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected from the database!");
        } else {
            System.out.println("No active connection to disconnect!");
        }
    }
}


