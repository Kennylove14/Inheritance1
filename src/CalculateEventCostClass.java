public class CalculateEventCostClass {
    public double calculateEventCost() {
        double eventCost = 5000.0;
        return eventCost;
    }

    public static void main(String[] args) {
        CalculateEventCostClass eventCalculator = new CalculateEventCostClass();
        double cost = eventCalculator.calculateEventCost();
        System.out.println("Event Cost: " + cost);
    }
}
