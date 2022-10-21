package Assignment_5_question_1;
class clientBO{

    void viewDetails(Client[] clientList){
        System.out.format("%-25s %-25s %-25s %-25s %-25s %-25s %s\n", "Client ID", "Client Name", "Phone Number", "Email", "Passport","IATACountryCode","Country Name");

        for(int i=0;i<clientList.length;i++)
            System.out.println(clientList[i].toString());
    }
    void printClientDetails(Client[] clientList, String countryName){
        
        for(int i=0;i<clientList.length;i++)
        if(countryName.equals(clientList[i].getCountryName())){
            System.out.format("%-25s %-25s %-25s %-25s %-25s %-25s %s\n", "Client ID", "Client Name", "Phone Number", "Email", "Passport","IATACountryCode","Country Name");
            System.out.println(clientList[i].toString());
            
            }
    }

}
