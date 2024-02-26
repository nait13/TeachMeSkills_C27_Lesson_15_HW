package com.teachmeskills.lesson15_hw.task_4.runner;

import com.teachmeskills.lesson15_hw.task_4.fabricPerson.FabricPerson;
import com.teachmeskills.lesson15_hw.task_4.person.Person;

import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Set<Person> groupC27 = FabricPerson.createGroup();
        System.out.println(groupC27);
    }
}
