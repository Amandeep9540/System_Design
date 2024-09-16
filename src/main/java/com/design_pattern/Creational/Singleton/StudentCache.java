package com.design_pattern.Creational.Singleton;

import java.util.HashMap;
import java.util.Objects;

public class StudentCache {
    /*
    *   In singleton design pattern there are two ways to initialize the object.
    *       1. Eager initialization     ( -- teacherInMemCache(another class) -- is an example)
    *       2. Lazy initialization ( -- getStudentCache() -- method is an example)
    * */
    public static volatile HashMap<String,Student> studentInMemCache = null;

    public static HashMap<String,Student> getStudentCache(){
        if(Objects.isNull(studentInMemCache)){
           synchronized (studentInMemCache){
                if(Objects.isNull(studentInMemCache)){
                    studentInMemCache = new HashMap<>();
                }
           }
        }
        return studentInMemCache;
    }


    public static boolean addDataInStudentCache(String key, Student value){
        try{
            if(Objects.nonNull(studentInMemCache)){
                studentInMemCache.put(key,value);
                return true;
            }
        }catch (Exception exception){
            System.out.println("Exception in adding data in Student Cache");
        }
        return false;
    }
}
