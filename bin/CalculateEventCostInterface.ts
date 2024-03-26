
public interface CalculateEventCostInterface {
    public void calculateEventCost；
}


public class ConferenceEvent extends Event implements CalculateEventCostInterface {

    @Override
    public void calculateEventCost() {

    }
}

public class MusicEvent extends Event implements CalculateEventCostInterface {

    @Override
    public void calculateEventCost() {
    }
}


public class PastEvent extends Event {

}
