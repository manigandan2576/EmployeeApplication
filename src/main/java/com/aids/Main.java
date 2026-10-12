package com.aids;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class)) {

            EmployeeService service =
                    context.getBean(EmployeeService.class);

            service.addEmployee("Sathya");
            service.displayEmployee();

            double salary = service.calculateSalary();
            System.out.println("Employee Salary: " + salary);
        }
    }
}