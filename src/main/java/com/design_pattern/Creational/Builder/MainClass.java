package com.design_pattern.Creational.Builder;

public class MainClass {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .setName("Test001")
                .setAddress("India")
                .setId(1)
                .build();

        System.out.println("employee class object :: "+employee.toString());
    }
}
