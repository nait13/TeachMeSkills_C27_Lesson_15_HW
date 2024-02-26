package com.teachmeskills.lesson15_hw.task_3.service;

import com.teachmeskills.lesson15_hw.task_3.consts.Consts;
import com.teachmeskills.lesson15_hw.task_3.validator.InputValidator;

import java.util.*;

/**
 * This class creates a collection of random numbers of the size entered by the user
 */
public class ListService {
    public static List<Integer> createListRandomNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        List<Integer> arrList = null;
        try {
            int size = InputValidator.checkInput(sc.nextInt());
            arrList = new ArrayList<>(size);
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                int randomNum = random.nextInt(Consts.MIN_NUM_RANDOM, Consts.MAX_NUM_RANDOM);
                arrList.add(randomNum);
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Не корректно введое число");
        } catch (Exception e) {
            System.out.println("Другая ошибка");
        } finally {
            sc.close();
        }
        return arrList;
    }
}
