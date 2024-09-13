package com.design_pattern.Creational.Factory.AbstractFactory;

import com.design_pattern.Creational.Factory.Factory.BachelorCourseFactory;
import com.design_pattern.Creational.Factory.Factory.CourseFactory;
import com.design_pattern.Creational.Factory.Factory.DiplomaCourseFactory;
import com.design_pattern.Creational.Factory.Factory.MastersCourseFactory;
import com.design_pattern.Creational.Factory.Enums.QualificationEnum;

public class CourseEligibilityFactory {

    public static CourseFactory getFactory(QualificationEnum qualification) {
        switch (qualification){
            case HIGH_SCHOOL:
                return new DiplomaCourseFactory();
            case INTERMEDIATE:
                return new BachelorCourseFactory();
            case BACHELOR:
                return new MastersCourseFactory();
            default:
                throw new RuntimeException("Invalid Qualification");
        }
    }

}
