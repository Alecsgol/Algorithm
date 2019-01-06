package ru.goluzov.se.coupString;

public class Main {
    public static void main (String[] argd) {
        CharString arrStr = new CharString("Happy New Yer");
        System.out.println(arrStr.coup());

        CharStringStack arrStr2 = new CharStringStack("Импровизация");
        arrStr2.coup();
    }
}