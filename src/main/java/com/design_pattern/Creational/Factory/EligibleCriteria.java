package com.design_pattern.Creational.Factory;

import com.design_pattern.Creational.Singleton.Student;

public interface EligibleCriteria {
    boolean isStudentEligible(Student student);
}
