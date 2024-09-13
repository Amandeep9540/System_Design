package com.design_pattern.Creational.Prototype;

import com.design_pattern.Creational.Singleton.Teacher;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
/*
* Instead of creating a Prototype Interface we can directly create a method that returns the copy.
* */
public class SportDean implements SchoolManagingMember,Prototype{

    public Integer id;
    public String name;
    public String address;
    public LocalDate assigningRoleDate;

    private List<Teacher> managingTeacher;

    public SportDean() {
    }

    public SportDean(Integer id, String name, String address, LocalDate assigningRoleDate,List<Teacher> managingTeacher) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.assigningRoleDate = assigningRoleDate;
        this.managingTeacher = managingTeacher;
    }

    @Override
    public Prototype clone() {
        return new SportDean(this.id,this.name,this.address,this.assigningRoleDate,this.managingTeacher);
    }

    @Override
    public Integer getDaysInRole() {
        return Math.toIntExact(ChronoUnit.DAYS.between(this.assigningRoleDate, LocalDate.now()));
    }

    /*
    * Suppose this is a heavy method that can cause a delay in creating the new object;
    * */
    @Override
    public List<Teacher> getManagingTeacher() {
        return managingTeacher;
    }
}
