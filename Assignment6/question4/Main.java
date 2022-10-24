package com.question4;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
     System.out.println("Enter the number of halls:");
     int noOfHalls = in.nextInt();
     in.nextLine();
     List<Hall> hallDetails = new ArrayList<>();
     while (noOfHalls-- != 0){
         String details = in.nextLine();
         String[] sArr = details.split(",");
         hallDetails.add(new Hall(sArr[0],Double.parseDouble(sArr[1]),sArr[2]));
     }

        Collections.sort(hallDetails,(o1,o2) -> (o1.getOwner().compareTo(o2.getOwner())));
        System.out.format("%-15s %-10s %s\n","Name","Cost","Owner");
        for(Hall details : hallDetails){
            System.out.format("%-15s %-10s %s\n",details.getName(),details.getCostPerDay(),details.getOwner());
        }
    }
}