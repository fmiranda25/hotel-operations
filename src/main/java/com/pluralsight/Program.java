package com.pluralsight;

public class Program {
    static Room room1 = new Room();
    public static void main(String[] args) {
        room1.setSize("king");
        System.out.println(room1.getSize());
        System.out.println(room1.getPrice());


    }
}
