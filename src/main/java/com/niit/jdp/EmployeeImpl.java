package com.niit.jdp;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee daniel = new Employee("Daniel",
                130,
                32,
                "124, Bridgewater, Eville",
                3000.0);
        double annualSalary = daniel.calculateAnnualSalary();
        System.out.println("Annual Salary Of Daniel = $" + annualSalary);
        double salaryAfterPayRaise = daniel.calculateSalaryAfterPayRaise(20);
        System.out.println("Salary Of Daniel After Pay Raise = $" + salaryAfterPayRaise);
    }
}