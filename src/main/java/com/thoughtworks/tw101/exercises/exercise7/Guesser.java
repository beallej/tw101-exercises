package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by josiebealle on 06/09/2016.
 */
public class Guesser {

    protected int rightAnswer;
    protected Scanner scanner;

    public Guesser() {

        scanner = new Scanner(System.in);
        Random r = new Random();

        //adjust to 1-100 from 0-99
        rightAnswer = r.nextInt(100) + 1;

    }

    protected int askForGuess(){
        System.out.println("Enter a guess: ");
        return scanner.nextInt();
    }

    protected GuessCloseness checkAnswer(int guess){
        if (guess == rightAnswer) {
            return GuessCloseness.equal;
        }
        else if (guess < rightAnswer){
            return GuessCloseness.tooLow;
        }
        else {
            return GuessCloseness.tooHigh;
        }
    }

    public void playGame(){
        GuessCloseness guessCloseness;
        boolean correct = false;
        while (!correct){
            guessCloseness = checkAnswer(askForGuess());
            switch (guessCloseness){
                case equal:
                    System.out.println("You win!");
                    break;
                case tooHigh:
                    System.out.println("Too High");
                    break;
                default:
                    System.out.println("Too Low");
                    break;
            }
            correct = (guessCloseness == GuessCloseness.equal);
        }

    }

}
