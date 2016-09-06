package com.thoughtworks.tw101.exercises.exercise5;

public class Rectangle {
    private final int length;
    private final int width;
    private final int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.area = length * width;

    }

    public int area(){
        return this.area;
    }
}
