package com.pluralsight;

public class Room {
    private String size;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room() {

    }

    public Room(String size, double price, boolean occupied, boolean dirty, boolean available) {
        this.size = size;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }










}
