package Assignment_5_question_1;

class Client extends Country{
    private int clientId;
    private String clientName;
    private String phoneNumber;
    private String email;
    private String passport;
    private Country country;

    Client(){}

    Client(int id, String name, String phn, String email, String pass, String cc, String cn){
        super(cc,cn);
        this.clientId = id;
        this.clientName = name;
        this.phoneNumber = phn;
        this.email = email;
        this.passport = pass;
       
    }

    int getClientId() {
        return clientId;
    }

    void setClientId(int clientId) {
        this.clientId = clientId;
    }

    String getClientName() {
        return clientName;
    }

    void setClientName(String clientName) {
        this.clientName = clientName;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getPassport() {
        return passport;
    }

    void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public
    String toString(){
        String sf1=String.format("%-25s %-25s %-25s %-25s %s\n",this.clientId,this.clientName,this.phoneNumber,this.email,this.passport); 
        String fin = super.toString() + sf1;
        return fin;
    }
}