package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by josiebealle on 06/09/2016.
 */
public class Guesser {

    protected int rightAnswer;
    protected Scanner scanner;
    private HashMap<Integer, GuessCloseness> closenessMap;

    public Guesser() {
        closenessMap = new HashMap<>(3);
        closenessMap.put(-1, GuessCloseness.tooLow);
        closenessMap.put(0, GuessCloseness.equal);
        closenessMap.put(1, GuessCloseness.tooHigh);

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
        int compared = Integer.compare(guess, rightAnswer);
        return closenessMap.get(compared);
    }

    public void playGame(){
        GuessCloseness guessCloseness;
        boolean correct = false;
        while (!correct){
            guessCloseness = checkAnswer(askForGuess());
            System.out.println(guessCloseness);
            correct = guessCloseness.isCorrect();
        }

    }

}
