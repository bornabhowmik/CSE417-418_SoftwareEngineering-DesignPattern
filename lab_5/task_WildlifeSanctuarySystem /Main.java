// Task 1: Singleton with Double-Checked Locking
class RadioNetworkManager {
    private static volatile RadioNetworkManager instance;
    private String frequency;
    private String status;

    private RadioNetworkManager() {
        this.frequency = "102.3 MHz";
        this.status = "Operational";
    }

    public static RadioNetworkManager getInstance() {
        if(instance == null) {
            synchronized(RadioNetworkManager.class) {
                if(instance == null) {
                    instance = new RadioNetworkManager();
                }
            }
        }
        return instance;
    }

    public void updateNetworkSettings(String newFrequency, String newStatus) {
        this.frequency = newFrequency;
        this.status = newStatus;
    }

    public void displayNetworkSettings() {
        System.out.println("Current Radio Frequency: " + frequency);
        System.out.println("Network Status: " + status);
    }
}

// Task 2: Encapsulation in RadioNetworkManager (already implemented above)

// Task 3: Inheritance - Define Base Staff Class
class Staff {
    protected String name;
    protected int staffId;
    protected String contactNumber;

    public Staff(String name, int staffId, String contactNumber) {
        this.name = name;
        this.staffId = staffId;
        this.contactNumber = contactNumber;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID Number: " + staffId);
        System.out.println("Contact Info: " + contactNumber);
        System.out.println("Access Level: " + getRolePermissions());
    }

    // Task 4: Polymorphism - Define a method for role-based permissions
    public String getRolePermissions() {
        return "Standard Access";
    }
}

// Task 3: Inheritance - Extend Staff Class for Ranger, Vet, and Volunteer
class Ranger extends Staff {
    public Ranger(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Field Operations Access";
    }
}

class Vet extends Staff {
    public Vet(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Veterinary Access";
    }
}

class Volunteer extends Staff {
    public Volunteer(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Guest Observer";
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Task 1 & 2: Singleton with Double-Checked Locking & Encapsulation
        RadioNetworkManager radioManager = RadioNetworkManager.getInstance();
        radioManager.displayNetworkSettings();
        
        System.out.println("\nModifying Network Settings: ");
        radioManager.updateNetworkSettings("99.8 MHz", "Under Maintenance");
        radioManager.displayNetworkSettings();

        System.out.println("\n");

        // Task 3 & 4: Inheritance and Polymorphism - Creating Staff Instances
        Staff ranger = new Ranger("Borna", 201, "555-123-4567");
        Staff vet = new Vet("Orpa", 202, "555-789-6543");
        Staff volunteer = new Volunteer("Nusrat", 203, "555-333-2222");

        ranger.displayInfo();
        System.out.println("\n");
        vet.displayInfo();
        System.out.println("\n");
        volunteer.displayInfo();
    }
}
