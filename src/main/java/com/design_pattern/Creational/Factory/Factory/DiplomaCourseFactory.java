package com.design_pattern.Creational.Factory.Factory;

import com.design_pattern.Creational.Factory.Courses.Courses;
import com.design_pattern.Creational.Factory.Courses.Diploma.DiplomaFiterDistanceCourse;
import com.design_pattern.Creational.Factory.Courses.Diploma.DiplomaFiterFullTimeCourse;
import com.design_pattern.Creational.Factory.Courses.Diploma.DiplomaFiterParTimeCourse;
import com.design_pattern.Creational.Factory.Enums.CourseTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class DiplomaCourseFactory implements CourseFactory{
    @Override
    public List<Courses> getCourseFactory(CourseTypeEnum courseTypeEnum) {
        List<Courses> courses =  new ArrayList<>();
        switch (courseTypeEnum){
            case Full_TIME :
                courses.add(new DiplomaFiterFullTimeCourse());
                return courses;
            case DISTANCE:
                courses.add(new DiplomaFiterDistanceCourse());
                return courses;
            case PART_TIME:
                courses.add(new DiplomaFiterParTimeCourse());
                return courses;
        }
        return null;
    }
}
