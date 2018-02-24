package generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Gear<T,U>{
    T name;
    U gearObject;

    public Gear(T name, U gearObject) {
        this.name = name;
        this.gearObject = gearObject;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getGearObject() {
        return gearObject;
    }

    public void setGearObject(U gearObject) {
        this.gearObject = gearObject;
    }

    public T getObj1() {
        return name;
    }

    public void setObj1(T obj1) {
        this.name = obj1;
    }

    public U getObj2() {
        return gearObject;
    }

    public void setObj2(U obj2) {
        this.gearObject = obj2;
    }


}