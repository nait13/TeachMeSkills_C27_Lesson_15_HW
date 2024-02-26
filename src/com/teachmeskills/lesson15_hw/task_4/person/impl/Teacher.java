package com.teachmeskills.lesson15_hw.task_4.person.impl;

import com.teachmeskills.lesson15_hw.task_4.person.Person;

import java.util.Objects;

/**
 * Teacher class extends from person
 */
public class Teacher extends Person {
    boolean isProgrammer = true;

    public Teacher(String name, boolean isProgrammer) {
        super(name);
        this.isProgrammer = isProgrammer;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name= " + super.getName() +
                " isProgrammer= " + isProgrammer +
                '}';
    }
}
