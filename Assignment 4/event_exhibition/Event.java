package event_exhibition;

public class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organisername;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganisername() {
        return this.organisername;
    }

    public void setOrganisername(String organisername) {
        this.organisername = organisername;
    }

    public Event() {
    }
    public Event(String name, String detail, String type, String organiserName){

    }
}
