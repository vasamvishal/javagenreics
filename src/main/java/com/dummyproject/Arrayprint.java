package com.dummyproject;

public class Arrayprint <X,Y,Z > {
 X[] myXArray;
 Y[] myYArray;
 Z[] myZArray;
        public Arrayprint(X[] myXArray,Y[] myYArray,Z[] myZArray){
            this.myXArray=myXArray;
            this.myYArray=myYArray;
            this.myZArray=myZArray;
        }
    public static void main(String args[]){
        Integer array[]={1,2,3};
        Double darray[]={1.0,2.0,3.0};
        Character carray[]={'a','b','c'};

        new Arrayprint<Integer,Double,Character>(array,darray,carray).toPrint();
    }

    public  void toPrint() {
            toPrint(myXArray);
            toPrint(myYArray);
            toPrint(myZArray);
    }
    private static <E> void toPrint(E[] array) {
        for(E i: array){
            System.out.println(i);
        }
    }



}
