package com.question1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number of Events:");
        int noOfEvents = in.nextInt();
        in.nextLine();
        if(noOfEvents <=0){
            System.out.println("Invalid Input");
            return;
        }
        List<Event> list = new ArrayList<>();
        System.out.println("Enter event details in CSV(Event Name,Maximum Tickets,Event OwnerName)");
        for(int i = 0 ; i  < noOfEvents ; i++){
            String newEvent = in.nextLine();
            String[] sArr = newEvent.split(",");
            list.add(new Event(sArr[0],Integer.parseInt(sArr[1]),sArr[2]));
        }
        System.out.println("Enter owner name:");
        String ownerName = in.nextLine();
        int freq = Collections.frequency(list, new Event(null,0,ownerName));
        System.out.println(ownerName + " has been organising : "+ freq + " events");

    }
}