package com.techreturners.exercise001;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    private int[] tempArray = null;

    public int singles(int[] arr) {
        tempArray = arr;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isOccurredOnlyOnce(arr[i])) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    private boolean isOccurredOnlyOnce(int number) {
        //Find out if the number occurred more than once
        int numOfOccurencies = 0;
        for (int i = 0; i < tempArray.length; i++) {
            //If number exists increment the count
            if (tempArray[i] == number) {
                numOfOccurencies = numOfOccurencies + 1;
            }
        }
        return numOfOccurencies == 1;

    }



}
