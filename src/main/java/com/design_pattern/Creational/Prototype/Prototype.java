package com.design_pattern.Creational.Prototype;

/*
*  This clone method is implemented by child class and return the clone of its object
*    -- Prototype design pattern used when creating the new object is very expensive --
* */
public interface Prototype {
    Prototype clone();
}
