public class MusicEvent{

    private boolean merchandiseRequired;
    private double merchandiseCost;
    private int eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;

    public MusicEvent(boolean merchandiseRequired, double merchandiseCost) {
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }
    public MusicEvent(int eventID, String eventName, String eventLocation, String pointOfContact) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getPointOfContact() {
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact) {
        this.pointOfContact = pointOfContact;
    }
    public double calculateEventCost(CalculateEventCostClass calculateEventCostObject) {
        double baseCost = calculateEventCostObject.calculateEventCost();
        double eventCost = baseCost + (baseCost * 0.3);
        return eventCost;
    }

    public double calculateEventCost() {

        double eventCost = 1000.0; 

        if (merchandiseRequired) {
            eventCost += merchandiseCost;
        }

        return eventCost;
    }

    public String toString() {
        return "Music Event Details:\n" +
               "Merchandise Required: " + (merchandiseRequired ? "Yes" : "No") + "\n" +
               "Merchandise Cost: $" + merchandiseCost;
    }

    public static void main(String[] args) {

        MusicEvent concertEvent = new MusicEvent(true, 500.0);

        double eventCost = concertEvent.calculateEventCost();

        System.out.println(concertEvent.toString());
        System.out.println("Total Event Cost: $" + eventCost);
    }
}


