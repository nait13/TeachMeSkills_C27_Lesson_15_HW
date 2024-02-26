package com.teachmeskills.lesson15_hw.task_2.figure;

/**
 *  This class contains abstract methods for calculating area and perimeter
 */

public abstract class Figure {
    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double getFigureArea();
    public abstract double getFigurePerimeter();


}
