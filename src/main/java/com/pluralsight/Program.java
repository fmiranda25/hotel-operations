package com.pluralsight;
import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Room room1 = new Room("king", 139, false, false, true);
        System.out.println(room1.getSize());
        System.out.println(room1.getPrice());
        System.out.println(room1.isOccupied());
        System.out.println(room1.isDirty());
        System.out.println(room1.isAvailable());

        Reservation reservation1 = new Reservation("king", 139, 2, true);
        System.out.println(reservation1.getPrice());

        Employee employee1 = new Employee("Turnip", "Fernando", "Miranda", "QA", 20.00, 41);
        System.out.println(employee1.getTotalPay());
        System.out.println(employee1.getFullName());

    }
}
