package Assignment_5_Question_3;

public class rbi implements bank{

    private String accountNumber;
    private double creditScore;
    private String holderName;
    final double CREDIT = 0.1;
    @Override
    public double calculateCreditScore() {
        return 0;
    }

    void display(){
        System.out.println("Amount Paid Successfully");
        System.out.println("Hi, " + holderName);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(double creditScore) {
        this.creditScore = creditScore;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
