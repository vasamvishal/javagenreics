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

    public Character threeCharacters() {
        Character firstnumber = 'a';
        Character secondnumber = 'b';
        Character lastnumber = 'c';

        Character maximum = lastnumber;
        if (firstnumber.compareTo(maximum) > 0) {
            maximum = firstnumber;
        } else if (secondnumber.compareTo(maximum) > 0) {
            maximum = secondnumber;
        } else if (lastnumber.compareTo(maximum) > 0) {
            maximum = lastnumber;
        }
        return maximum;
    }

    public Float threeFloat() {
        Float firstnumber = 1.0f;
        Float secondnumber = 2.0f;
        Float lastnumber =3.0f;
        Float maximum = lastnumber;
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












