package com.teachmeskills.lesson15_hw.task_4.person.impl;

import com.teachmeskills.lesson15_hw.task_4.person.Person;

/**
 * Student class extends from person
 */
public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Student{" + "name: " +
                super.getName() +
                "}";
    }
}
