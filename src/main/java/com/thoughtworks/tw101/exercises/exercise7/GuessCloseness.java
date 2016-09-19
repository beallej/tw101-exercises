package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by josiebealle on 06/09/2016.
 */
public enum GuessCloseness {
    tooLow {
        @Override
        public String toString() {
            return "Too Low";
        }
    },
    tooHigh {
        @Override
        public String toString() {
            return "Too High";
        }
    },
    equal {
        @Override
        public String toString() {
            return "You Win!";
        }
    };

    public boolean isCorrect(){
        return (this == GuessCloseness.equal);
    }

}
