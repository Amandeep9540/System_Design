package com.design_pattern.Creational.Builder;

/*
* In Builder all setter method return the intermediate result (Builder class itself)
* But build method return the wanted instance (Employee).
* */

/*
* If you want to create any field mandatory than you can use constructor for those fields.
* */
public class EmployeeBuilder {
    private int id;
    private String name;
    private String address;
    private String designation;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee build(){
        return new Employee(this);
    }
}
