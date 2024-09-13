package com.design_pattern.Creational.Singleton;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
                // Student cache is and example of Lazy initialization in Singleton Design Pattern
        HashMap<String, Student> studentCache = StudentCache.getStudentCache();
                // Teacher cache is and example of Eager initialization in Singleton Design Pattern
        HashMap<String, Teacher> teacherCache = TeacherCache.getTeacherCache();

        Student student = new Student();
        student.setId(101);
        student.setName("Test01");
        student.setRollNo(String.valueOf(21));
        student.setStandard("XII");

        Student student2 = new Student();
        student2.setId(102);
        student2.setName("Test02");
        student2.setRollNo(String.valueOf(22));
        student2.setStandard("XII");

        studentCache.put(String.valueOf(student.getId()),student);
        StudentCache.addDataInStudentCache(String.valueOf(student2.getId()),student2);

        for (Map.Entry<String, Student> stuCache:studentCache.entrySet()) {
                System.out.println("student Cache key is :: "+stuCache.getKey()+ " and value is :: "+stuCache.getValue());
        }
    }
}
