package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int increments = 0;

    public void incrememnt(){
        increments++;
    }

    public void total(){
        System.out.println(increments);
    }

}
