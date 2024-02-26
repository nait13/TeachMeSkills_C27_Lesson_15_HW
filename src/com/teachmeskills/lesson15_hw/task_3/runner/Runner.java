package com.teachmeskills.lesson15_hw.task_3.runner;

import com.teachmeskills.lesson15_hw.task_3.service.ArithmeticOperation;
import com.teachmeskills.lesson15_hw.task_3.service.ListService;

public class Runner {
    public static void main(String[] args) {
        ArithmeticOperation.getAverage(ListService.createListRandomNum());
    }
}
