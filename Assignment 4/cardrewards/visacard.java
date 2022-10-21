package cardrewards;

class visacard{
    private String holdername;
    private String cvv;
    
    public String getName() {
        return holdername;
    }
    public void setName(String newName) {
        this.holdername = newName;
    }
    public String getcvv(){
        return cvv;
    }
    public void setcvv(String cvv){
        this.cvv=cvv;
    }
    public Double computeRewardPoints(String purchaseType, Double amount){
        return amount*0.01;
    }
}