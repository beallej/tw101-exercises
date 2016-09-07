package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.Guesser;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Created by josiebealle on 07/09/2016.
 */
public class BetterGuesser extends Guesser{

    private ArrayList<Integer> guesses = new ArrayList<>();

    @Override
    protected int askForGuess() {
        System.out.println("Enter a guess: ");
        while (true){
            try {
                String guessEntered = scanner.nextLine();
                int guessInteger = Integer.parseInt(guessEntered);
                guesses.add(guessInteger);
                return guessInteger;
            }
            catch (NumberFormatException e){
                System.out.println("Oops! Please enter an integer");

            }
        }
    }

    @Override
    public void playGame() {
        super.playGame();
        System.out.println("Here were your guesses: ");
        System.out.println(guesses.toString());

    }

}
