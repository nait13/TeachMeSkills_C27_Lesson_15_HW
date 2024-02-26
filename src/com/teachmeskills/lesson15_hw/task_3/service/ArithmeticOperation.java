package com.teachmeskills.lesson15_hw.task_3.service;

import java.util.List;

/**
 * This class contains a method for calculating the arithmetic average of a number from a collection
 */
public class ArithmeticOperation {
    public static void getAverage(List<Integer> arr) {
        int count = 0;
        for (Integer al : arr){
            count+=al;
        }
        System.out.println("Среднее арифметическое: " + (count / arr.size()));
    }
}
