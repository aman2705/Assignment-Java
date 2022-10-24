package com.question3;

public class Address implements Comparable<Address>{
    private String userName;
    private String addressLine1;
    private String addressLine2;
    private int pinCode;

    public Address() {

    }

    public Address(String userName, String addressLine1, String addressLine2, int pinCode) {
        this.userName = userName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int compareTo(Address o) {
        Address aObj = (Address) o;
        if(getPinCode() == aObj.getPinCode()){
            return getAddressLine1().compareTo(aObj.getAddressLine1());
        }
        else if(getPinCode() > aObj.getPinCode()){
            return 1;
        }
        else{
            return -1;
        }
    }
}