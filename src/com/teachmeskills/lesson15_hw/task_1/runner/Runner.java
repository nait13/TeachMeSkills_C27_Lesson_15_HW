package com.teachmeskills.lesson15_hw.task_1.runner;

import static com.teachmeskills.lesson15_hw.task_1.service.ServiceList.CreateNumbersCollection;
import static com.teachmeskills.lesson15_hw.task_1.service.ServiceList.printCollectionEvenNumbers;

public class Runner {
    public static void main(String[] args) {
        printCollectionEvenNumbers(CreateNumbersCollection());
    }
}
