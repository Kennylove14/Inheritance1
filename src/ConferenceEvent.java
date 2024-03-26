public class ConferenceEvent{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;
    private int eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private CalculateEventCostClass calculateEventCostObject;

    
    public ConferenceEvent(int eventID, String eventName, String eventLocation, String pointOfContact) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
    }

    public double getBreakfastCost(){
        return breakfastCost;
    }

    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost = breakfastCost;
    }

    public double getLunchCost(){
        return lunchCost;
    }

    public void setLunchCost(double lunchCost){
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost(){
        return dinnerCost;
    }

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays, 
    double breakfastCost, double lunchCost, double dinnerCost){
        
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
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

    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Total Conference Cost: " + conferenceEventCost;
    } 
        
}

    


