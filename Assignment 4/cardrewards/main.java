package cardrewards;
import java.util.*;

public class main {
    public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
        
        while(true){

             System.out.println("Choose Card Type:");
             System.out.println("1.VISA card");
             System.out.println("2.HPVISA card");
             int flag=sc.nextInt();
             System.out.println("Enter the card holder name");
             String name=sc.nextLine();
             sc.nextLine();
            System.out.println("Enter the CVV");
             String cvv=sc.nextLine();
             System.out.println("Enter the bill");
             double bill=sc.nextDouble();
             sc.nextLine();
             System.out.println("Enter the spend type");
             String spend=sc.nextLine();
             
             
             if(flag==1){
                 visacard v=new visacard();
                 v.setName(name);
                 v.setcvv(cvv);
                 double res=v.computeRewardPoints(spend, bill);

                 System.out.println("The holder card name "+v.getName());
                 System.out.println("The cvv is "+v.getcvv());
                 System.out.println("Reward Points "+res);
             }
             else{
                 hpvisacard hp=new hpvisacard();
                 hp.setName(name);
                 hp.setcvv(cvv);
                 double res=hp.computeRewardPoints(spend,bill);
                 System.out.println("The holder card name "+hp.getName());
                 System.out.println("The cvv is "+hp.getcvv());
                 System.out.println("Reward Points "+res);
             }
            
             System.out.println("Do you want to continue?");
             String str=sc.next();
             if(str.equals("N")){
                 break;
             }
             else{
                 continue;
             }
        }
   
        
    }

}
