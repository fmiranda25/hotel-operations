package com.pluralsight;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String firstName, String lastName, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String name) {
        getFullName();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getTotalPay() {
        double totalPay = 0;
        if (hoursWorked <= 40) {
            totalPay = payRate * hoursWorked;
        } else if (hoursWorked > 40) {
            totalPay = (payRate * 40) + (payRate * (hoursWorked - 40) * 1.5);
        }
        return totalPay;
    }

    public void setTotalPay(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

}
