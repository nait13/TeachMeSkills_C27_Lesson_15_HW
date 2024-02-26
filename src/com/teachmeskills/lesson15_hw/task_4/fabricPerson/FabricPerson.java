package com.teachmeskills.lesson15_hw.task_4.fabricPerson;

import com.teachmeskills.lesson15_hw.task_4.person.Person;
import com.teachmeskills.lesson15_hw.task_4.person.impl.Student;
import com.teachmeskills.lesson15_hw.task_4.person.impl.Teacher;

import java.util.HashSet;
import java.util.Set;

/**
 * The class creates a unique group of students + teacher
 */
public class FabricPerson {
    public static Set<Person> createGroup() {
        Set<Person> groupC27 = new HashSet<>();
        groupC27.add(new Teacher("Andrew", true));
        groupC27.add(new Student("Andrew"));
        groupC27.add(new Student("Alex"));
        groupC27.add(new Student("Alex"));
        groupC27.add(new Student("Oleg"));
        groupC27.add(new Student("Artem"));
        groupC27.add(new Student("Artem"));
        groupC27.add(new Student("Alina"));
        groupC27.add(new Student("Ruslan"));
        groupC27.add(new Student("Ruslan"));
        groupC27.add(new Student("Nikita"));
        groupC27.add(new Student("Nikita"));
        return groupC27;
    }
}
