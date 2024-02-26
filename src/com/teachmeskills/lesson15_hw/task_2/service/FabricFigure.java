package com.teachmeskills.lesson15_hw.task_2.service;

import com.teachmeskills.lesson15_hw.task_2.figure.Figure;
import com.teachmeskills.lesson15_hw.task_2.figure.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 *This class creates a collection of figure and a method for printing the perimeter to the terminal
 */
public class FabricFigure {
    public static List<Figure> createFigureList() {
        Figure circle1 = new Circle("Cercle1 ", 7);
        Figure rectangle1 = new Rectangle("Rectangle1 ", 10, 7);
        Figure triangle1 = new Triangle("Triangle1 ", 8, 14, 3);

        List<Figure> arrList = new ArrayList<>();
        arrList.add(circle1);
        arrList.add(rectangle1);
        arrList.add(triangle1);

        return arrList;
    }

    public static void getPerimeterFigure (List<Figure> arrList){
        for (Figure f : arrList){
            System.out.println(f.name + f.getFigurePerimeter());
        }
    }

}
