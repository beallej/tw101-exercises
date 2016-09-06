package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    //    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.
    public int of(int start, int end) {

        int firstOdd = (start % 2 == 1) ? start : start + 1;
        int lastOdd = (end % 2 == 1) ? end : end - 1;

        int answer = 0;
        for (int i = firstOdd; i <= lastOdd; i += 2){
            answer += i;
        }

        return answer;
    }
}
