package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        if (rectangles.length == 0) {
            return 0;
        }
        float total = 0;
        for (Rectangle rect: rectangles){
            total += rect.area();
        }


        return total/rectangles.length;
    }
}
