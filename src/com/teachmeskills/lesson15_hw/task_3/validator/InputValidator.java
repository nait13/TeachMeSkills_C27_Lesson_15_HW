package com.teachmeskills.lesson15_hw.task_3.validator;

/**
 * This class will check the correctness of the input data
 */
public class InputValidator {
    public static int checkInput(int num) throws NumberFormatException {
        if(num < 0) {
            throw new NumberFormatException("Ошибка: Число должно быть положительным ");
        }
        if(num == 0) {
            throw new NumberFormatException("Ошибка: Число должно быть ольше 0");
        }
        return num;
    }
}
