package com.aids;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private int employeeId;
    private String employeeName;
    private double salary = 25000.0;

    public void addEmployee(String name) {
        employeeId = 101;
        employeeName = name;

        System.out.println("Employee added: " + employeeName);
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }

    public double calculateSalary() {
        return salary;
    }
}