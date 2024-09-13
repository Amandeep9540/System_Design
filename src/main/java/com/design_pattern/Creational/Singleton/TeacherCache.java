package com.design_pattern.Creational.Singleton;

import java.util.HashMap;
import java.util.Objects;

public class TeacherCache {
    public static HashMap<String,Teacher> teacherInMemCache= new HashMap<>();

    public static HashMap<String,Teacher> getTeacherCache(){
        return teacherInMemCache;
    }

    public static boolean addDataInStudentCache(String key, Teacher value){
        try{
            if(Objects.nonNull(teacherInMemCache)){
                teacherInMemCache.put(key,value);
                return true;
            }
        }catch (Exception exception){
            System.out.println("Exception in adding data in teacher Cache");
        }
        return false;
    }
}
