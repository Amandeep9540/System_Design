package com.design_pattern.Creational.Factory.Factory;

import com.design_pattern.Creational.Factory.Courses.Courses;
import com.design_pattern.Creational.Factory.Courses.Master.MCADistanceCourse;
import com.design_pattern.Creational.Factory.Courses.Master.MCAFullTimeCourse;
import com.design_pattern.Creational.Factory.Courses.Master.MCAPartTimeCourse;
import com.design_pattern.Creational.Factory.Enums.CourseTypeEnum;

import java.util.ArrayList;
import java.util.List;

public class MastersCourseFactory implements CourseFactory{
    @Override
    public List<Courses> getCourseFactory(CourseTypeEnum courseTypeEnum) {
        List<Courses> courses =  new ArrayList<>();
        switch (courseTypeEnum){
            case Full_TIME :
                courses.add(new MCAFullTimeCourse());
                return courses;
            case DISTANCE:
                courses.add(new MCADistanceCourse());
                return courses;
            case PART_TIME:
                courses.add(new MCAPartTimeCourse());
                return courses;
        }
        return null;
    }
}
