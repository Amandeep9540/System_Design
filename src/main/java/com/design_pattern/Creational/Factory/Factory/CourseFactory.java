package com.design_pattern.Creational.Factory.Factory;

import com.design_pattern.Creational.Factory.Courses.Courses;
import com.design_pattern.Creational.Factory.Enums.CourseTypeEnum;

import java.util.List;

public interface CourseFactory {
    List<Courses> getCourseFactory(CourseTypeEnum courseTypeEnum);
}
