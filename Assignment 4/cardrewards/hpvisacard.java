package cardrewards;

public class hpvisacard extends visacard{

    public Double computeRewardPoints(String purchaseType, Double amount){
    
        if(purchaseType.equals("fuel")){
            return (amount*0.01)+10;
        }
        return (amount*0.01);
    }
}
