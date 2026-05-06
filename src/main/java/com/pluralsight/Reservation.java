package com.pluralsight;

public class Reservation {
    private String roomType;
    private int price;
    private int numberOfNights;
    private boolean weekend;
    // probably no need for a reservationTotal data field


    public Reservation(String roomType, int price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getPrice() {
        if (roomType.equals("king")) {
            price = 139;
        } else if (roomType.equals("twin")) {
            price = 124;
        }
        if (weekend) {
            price *= 1.1;
        }
        price = price * numberOfNights;
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
