package com.design_pattern.Creational.Builder;

public class Employee {
    private int id;
    private String name;
    private String address;
    private String designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(){

    }
    public Employee(EmployeeBuilder employeeBuilder){
        this.name = employeeBuilder.getName();
        this.address = employeeBuilder.getAddress();
        this.designation = employeeBuilder.getDesignation();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
