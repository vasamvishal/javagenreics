package com.dummyproject;

public class MaximumofThreeClass {
    public Integer threeIntegers() {
        Integer firstnumber = 10;
        Integer secondnumber = 20;
        Integer lastnumber = 30;

        Integer maximum = lastnumber;
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











