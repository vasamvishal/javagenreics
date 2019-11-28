package com.dummyproject;

public class MaximumofThreeClass {

    public <E extends Comparable> E printArray(E firstnumber, E secondnumber, E lastnumber) {
        E maximum = lastnumber;
        if (firstnumber.compareTo(maximum) > 0) {
            maximum = firstnumber;
        } else if (secondnumber.compareTo(maximum) > 0) {
            maximum = secondnumber;
        } else if (lastnumber.compareTo(maximum) > 0) {
            maximum = lastnumber;
        }
        return maximum;
    }
}















