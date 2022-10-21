package event_exhibition;
import java.util.*;
public class main {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        while(true){

            int flag=sc.nextInt();
            String name=sc.nextLine();
            String detail=sc.nextLine();
            String type=sc.nextLine();
            String organisername=sc.nextLine();
            
            if(flag==1){
                int noOfStalls=sc.nextInt();
                Exhibition ex=new Exhibition();
                ex.setName(name);
                ex.setDetail(detail);
                ex.setType(type);
                ex.setOrganisername(organisername);
                ex.setNoofStalls(noOfStalls);

                System.out.println(ex.getName());
                System.out.println(ex.getDetail());
                System.out.println(ex.getType());
                System.out.println(ex.getOrganisername());
                System.out.println(ex.getNoofStalls());


            }
            else if(flag==2){
                int noOfSeats=sc.nextInt();
                StageEvent st=new StageEvent();
                st.setName(name);
                st.setDetail(detail);
                st.setType(type);
                st.setOrganisername(organisername);
                st.setNoOfSeats(noOfSeats);

                System.out.println(st.getName());
                System.out.println(st.getDetail());
                System.out.println(st.getType());
                System.out.println(st.getOrganisername());
                System.out.println(st.getNoOfSeats());
            }
            else{
                break;
            }
           
       }
    }
}
