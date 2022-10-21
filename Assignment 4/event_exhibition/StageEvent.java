package event_exhibition;

public class StageEvent extends Event {
    private int noOfSeats;
    public int getNoOfSeats() {
        return this.noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public StageEvent() {

    }
    public StageEvent(String name, String detail, String type, String organiserName, int noOfSeats){

    }
}
