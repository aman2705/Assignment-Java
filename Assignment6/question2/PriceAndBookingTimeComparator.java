package com.question2;

import java.util.Date;
public class PriceAndBookingTimeComparator extends TicketBooking implements Comparable<TicketBooking> {
    PriceAndBookingTimeComparator(String stageEventShow, Date bookingTime, String seatNumber, Double price){
        super(stageEventShow,bookingTime,seatNumber,price);
    }
    @Override
    public int compareTo(TicketBooking tbobj) {
        if(getPrice() == tbobj.getPrice())
        {
            return getBookingTime().compareTo(tbobj.getBookingTime());
        }
        else if(getPrice()  >  tbobj.getPrice()){
            return 1;
        }
        else{
            return -1;
        }

    }

}