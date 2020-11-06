package com.techreturners.exercise002;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
        int totalmillis = h*60*60*1000 + m*60*1000 + s*1000;
        return totalmillis;
    }
}