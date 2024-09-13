package com.design_pattern.Creational.Prototype;

import com.design_pattern.Creational.Singleton.Teacher;

import java.util.List;

public interface SchoolManagingMember {
    Integer getDaysInRole();
    List<Teacher> getManagingTeacher();
}
