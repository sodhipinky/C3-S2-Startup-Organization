package com.niit.jdp;

public class Employee {
    String name;
    long code;
    int age;
    String address;
    double salary;

    public Employee(String name, long code, int age, String address, double salary) {
        this.name = name;
        this.code = code;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    double calculateSalaryAfterPayRaise(double hikePercentage) {
        return (salary + (salary * hikePercentage / 100));
    }
}
