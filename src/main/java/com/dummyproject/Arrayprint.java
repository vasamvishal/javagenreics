package com.dummyproject;

public class Arrayprint {

    public static void main(String args[]){
        Integer array[]={1,2,3};
        Double darray[]={1.0,2.0,3.0};
        Character carray[]={'a','b','c'};
        toPrint(array);
        toPrint(darray);
        toPrint(carray);


    }

    private static <E> void toPrint(E[] array) {
        for(E i: array){
            System.out.println(i);
        }
    }

    private static void toPrint(char[] carray) {
        for (int i = 0; i < carray.length; i++) {
            System.out.println(carray[i]);
        }
    }

    private static void toPrint(double[] darray) {
        for (int i = 0; i < darray.length; i++) {
            System.out.println(darray[i]);
        }

    }

    private static void toPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
