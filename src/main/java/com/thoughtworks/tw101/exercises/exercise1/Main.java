package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101 ; i++){
            sum += i;
            System.out.println(i);
        }
        System.out.printf("Sum: %d", sum);

    }
}
