package Assignment_5_question_1;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of users:");
        int n = sc.nextInt();
        sc.nextLine();
        Client arr[] = new Client[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter country code:");
            String cco = sc.nextLine();
            System.out.println("Enter country name:");
            String cn = sc.nextLine();
            // Country cc = new Country(cco,cn);
            System.out.println("Enter client id:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter client name:");
            String name = sc.nextLine();
            System.out.println("Enter client phone number:");
            String phn = sc.nextLine();
            System.out.println("Enter client email:");
            String email = sc.nextLine();
            System.out.println("Enter client passport number:");
            String pass = sc.nextLine();
            arr[i] = new Client(id,name,phn,email,pass,cco,cn);
        }

        while(true){
            System.out.println("1. View Details");
            System.out.println("2. Filter client with country");
            System.out.println("3. Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            clientBO cb = new clientBO();

            if(ch==1)
                cb.viewDetails(arr);
            
            else if(ch==2){
                System.out.println("Enter country:");
                String country = sc.nextLine();
                cb.printClientDetails(arr, country);
            }
            
            else if(ch==3)
                System.exit(0);
            
            else
                System.out.println("Invalid Choice");
        }

    }
}
