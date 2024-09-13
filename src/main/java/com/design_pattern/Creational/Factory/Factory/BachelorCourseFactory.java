package com.design_pattern.Creational.Factory.Factory;

import com.design_pattern.Creational.Factory.Courses.Bachelor.BCADistanceCourse;
import com.design_pattern.Creational.Factory.Courses.Bachelor.BCAFullTimeCourse;
import com.design_pattern.Creational.Factory.Courses.Bachelor.BCAPartTimeCourse;
import com.design_pattern.Creational.Factory.Courses.Courses;
import com.design_pattern.Creational.Factory.Enums.CourseTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class BachelorCourseFactory implements CourseFactory{
    @Override
    public List<Courses> getCourseFactory(CourseTypeEnum courseTypeEnum) {
        List<Courses> courses =  new ArrayList<>();
        switch (courseTypeEnum){
            case Full_TIME :
                courses.add(new BCAFullTimeCourse());
                return courses;
            case DISTANCE:
                courses.add(new BCADistanceCourse());
                return courses;
            case PART_TIME:
                courses.add(new BCAPartTimeCourse());
                return courses;
        }
        return null;
    }
}
