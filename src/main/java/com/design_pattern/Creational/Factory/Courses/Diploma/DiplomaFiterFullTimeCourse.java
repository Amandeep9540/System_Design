package com.design_pattern.Creational.Factory.Courses.Diploma;

import com.design_pattern.Creational.Factory.Courses.Bachelor.BachelorCourses;
import com.design_pattern.Creational.Factory.FullTimeCourses;
import com.design_pattern.Creational.Singleton.Student;

public class DiplomaFiterFullTimeCourse implements BachelorCourses, FullTimeCourses {
    Integer id;
    String courseName;
    String courseDescription;
    Integer courseDurationInDays;

    @Override
    public boolean registerStudent(Student student) {
        return false;
    }

    @Override
    public boolean isStudentEligible(Student student) {
        return false;
    }
}
