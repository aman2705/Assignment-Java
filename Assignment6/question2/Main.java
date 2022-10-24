package com.question2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of bookings:");
        int n = in.nextInt();
        in.nextLine();
        int i = 0;
        ArrayList<PriceAndBookingTimeComparator> detailsList = new ArrayList<>();
        PriceAndBookingTimeComparator[] tbObj = new PriceAndBookingTimeComparator[n];
        while(n-- != 0)
        {
            System.out.println("Enter the details of booking " + (i+1));
            String details = in.nextLine();
            String[] arr = details.split(",");
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(arr[1]);
            tbObj[i] = new PriceAndBookingTimeComparator(arr[0], date, arr[2], Double.parseDouble(arr[3]));
            detailsList.add(tbObj[i]);
            i++;
        }
        System.out.println("Sorted Order:");
        System.out.println(String.format("%-15s %-15s %-15s %-15s","Event Name","Booking Time","Seat Number","Price"));
        Collections.sort(detailsList);
        for(PriceAndBookingTimeComparator ticket : detailsList ){
            System.out.println(String.format("%-15s %-15s %-15s %-15s",ticket.getStageEventShow(),ticket.getBookingTime(),ticket.getSeatNumber(),ticket.getPrice()));
        }
    }
}