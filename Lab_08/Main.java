// Component Interface
interface AmanUllahCentre {
    String getDescription();
    double getCost();
}

// Concrete Component (Base Hall Booking)
class BasicHallBooking implements AmanUllahCentre {
    @Override
    public String getDescription() {
        return "Basic Hall";
    }

    @Override
    public double getCost() {
        return 50000.0; // Base cost
    }
}

// Abstract Decorator
abstract class HallBooking implements AmanUllahCentre {
    protected AmanUllahCentre decoratedBooking;
    
    public HallBooking(AmanUllahCentre booking) {
        this.decoratedBooking = booking;
    }
    
    @Override
    public String getDescription() {
        return decoratedBooking.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedBooking.getCost();
    }
}

// Event Decorators
class Wedding extends HallBooking {
    public Wedding(AmanUllahCentre booking) {
        super(booking);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Wedding Setup";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 40000.0;
    }
}

class BirthdayParty extends HallBooking {
    public BirthdayParty(AmanUllahCentre booking) {
        super(booking);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Birthday Setup";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 20000.0;
    }
}

class IELTSExam extends HallBooking {
    public IELTSExam(AmanUllahCentre booking) {
        super(booking);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", IELTS Exam Setup";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 30000.0;
    }
}

class TechWorkshop extends HallBooking {
    public TechWorkshop(AmanUllahCentre booking) {
        super(booking);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Tech Workshop Setup";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 35000.0;
    }
}

// Service Decorators
class CateringService extends HallBooking {
    public CateringService(AmanUllahCentre booking) {
        super(booking);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Catering Service";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 20000.0;
    }
}

class AudioVisual extends HallBooking {
    public AudioVisual(AmanUllahCentre booking) {
        super(booking);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Audio-Visual Setup";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 15000.0;
    }
}

class ExtraSeating extends HallBooking {
    public ExtraSeating(AmanUllahCentre booking) {
        super(booking);
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Seating";
    }
    
    @Override
    public double getCost() {
        return super.getCost() + 10000.0;
    }
}

// Test Program
public class Main {
    public static void main(String[] args) {
        // Case 1
        AmanUllahCentre weddingBooking = new Wedding(new BasicHallBooking());
        weddingBooking = new CateringService(weddingBooking);
        weddingBooking = new AudioVisual(weddingBooking);
        System.out.println("Booking Details: " + weddingBooking.getDescription());
        System.out.println("Total Cost: BDT " + weddingBooking.getCost());
        
        // Case 2
        AmanUllahCentre examBooking = new IELTSExam(new BasicHallBooking());
        examBooking = new ExtraSeating(examBooking);
        System.out.println("\nBooking Details: " + examBooking.getDescription());
        System.out.println("Total Cost: BDT " + examBooking.getCost());
        
        // Case 3
        AmanUllahCentre birthdayBooking = new BirthdayParty(new BasicHallBooking());
        birthdayBooking = new CateringService(birthdayBooking);
        birthdayBooking = new ExtraSeating(birthdayBooking);
        System.out.println("\nBooking Details: " + birthdayBooking.getDescription());
        System.out.println("Total Cost: BDT " + birthdayBooking.getCost());
        
        // Case 4
        AmanUllahCentre workshopBooking = new TechWorkshop(new BasicHallBooking());
        workshopBooking = new AudioVisual(workshopBooking);
        System.out.println("\nBooking Details: " + workshopBooking.getDescription());
        System.out.println("Total Cost: BDT " + workshopBooking.getCost());
    }
}
