package event_exhibition;

public class Exhibition extends Event {
    private int noofStalls;
    public int getNoofStalls() {
        return this.noofStalls;
    }

    public void setNoofStalls(int noofStalls) {
        this.noofStalls = noofStalls;
    }


    public Exhibition() {
    }
  
    public Exhibition(String name, String detail, String type, String organiserName, int noOfStalls){

    }
}
