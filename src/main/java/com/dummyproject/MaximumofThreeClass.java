package com.dummyproject;

public class MaximumofThreeClass<E extends Comparable> {
    E firstnumber;
    E secondnumber;
    E lastnumber;

    public MaximumofThreeClass(E firstnumber,E secondnumber,E lastnumber) {
        this.firstnumber=firstnumber;
        this.lastnumber=lastnumber;
        this.secondnumber=secondnumber;
    }

    public   <E extends Comparable> E printArray( ) {
        E maximum = (E)lastnumber;
        if (firstnumber.compareTo(maximum) > 0) {
            maximum = (E) firstnumber;
        } else if ( secondnumber.compareTo(maximum) > 0) {
            maximum = (E) secondnumber;
        } else if (lastnumber.compareTo(maximum) > 0) {
            maximum = (E) lastnumber;
        }
        return maximum;
    }
}















