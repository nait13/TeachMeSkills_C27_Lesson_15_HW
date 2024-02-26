package com.teachmeskills.lesson15_hw.task_1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This method takes a string from the user, converts it to a number and adds it to the collection, returns a collection of numbers
 */
public class ServiceList {
    public static List<Integer> CreateNumbersCollection(){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введите целое число или exit");
            String userChoice = sc.nextLine();
            if (userChoice.toLowerCase().equals("exit")){
                break;
            }
            try {
                int i = Integer.parseInt(userChoice);
                list.add(i);
            }catch (NumberFormatException e){
                list.add(0);
            }catch (Exception e){
                System.out.println("Ошибка!");
            }
        }
        sc.close();
        return list;
    }

    /**
     * This method prints only even numbers to the console
     */
    public static void printCollectionEvenNumbers(List<Integer> arr){
        for (Integer i : arr){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
