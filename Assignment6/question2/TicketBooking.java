package com.question2;

import java.util.Date;

public class TicketBooking {
    private String stageEventShow;
    private Date bookingTime;
    private String seatNumber;
    private Double price;

    public TicketBooking(){

    }

    public TicketBooking(String stageEventShow, Date bookingTime, String seatNumber, Double price) {
        this.stageEventShow = stageEventShow;
        this.bookingTime = bookingTime;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getStageEventShow() {
        return this.stageEventShow;
    }

    public void setStageEventShow(String stageEventShow) {
        this.stageEventShow = stageEventShow;
    }

    public Date getBookingTime() {
        return this.bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %-15s",getStageEventShow(),getBookingTime(),getSeatNumber(),getPrice());
    }


}