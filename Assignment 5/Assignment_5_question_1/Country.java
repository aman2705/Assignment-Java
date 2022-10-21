package Assignment_5_question_1;

import java.util.Scanner;

class Country{
    private String iataCountryCode;
    private String countryName;

    Country(){}

    Country(String cc, String name){
        this.iataCountryCode = cc;
        this.countryName = name;
    }
    
    public String getIataCountryCode() {
        return iataCountryCode;
    }

    
    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public
    String toString(){
        String sf1=String.format("%-25s %s\n",this.iataCountryCode,this.countryName);  
        return sf1;
    }
}

