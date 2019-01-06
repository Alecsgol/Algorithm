package ru.goluzov.se;

import java.util.concurrent.*;

public class MainClass {
    public static void main (String[] args) {
        ArrayClassMy arr =  new ArrayClassMy(10000);
        arr.fillArray( 10000 );
        ArrayClassMy arr2 = new ArrayClassMy(arr.getArray(), 10000);
        ArrayClassMy arr3 = new ArrayClassMy(arr.getArray(), 10000);
//        arr.addElement(9);
//        arr.addElement(8);
//        arr.addElement(7);
//        arr.insertElement(1,6);
//        arr.deleteElement(2);
//        arr.addElement(5);
//        arr.addElement(1);
//        System.out.println(arr.linearSearch(7));
//        for(int i=0; i<arr.getSize(); i++) {
//            System.out.println(i+" - " + arr.getElement(i));
//        }
        long Start = System.nanoTime();
        arr.sortBubble();
        long Finish = System.nanoTime();
        System.out.println("sortBubble " + TimeUnit.NANOSECONDS.toMillis(Finish-Start) );
        Start = System.nanoTime();
        arr2.sortSelect();
        Finish = System.nanoTime();
        System.out.println("sortSelect " + TimeUnit.NANOSECONDS.toMillis(Finish-Start) );
        Start = System.nanoTime();
        arr3.sortInsert();
        Finish = System.nanoTime();
        System.out.println("sortInsert " + TimeUnit.NANOSECONDS.toMillis(Finish-Start) );
        System.out.println(Finish-Start);
        for(int i=0; i<arr.getSize(); i++) {
            System.out.println(i+" - " + arr.getElement(i));
        }

        System.out.println(arr.binarySearch(9));
    }
}