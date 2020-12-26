package com.company.oop;

// Imangali Kalybek

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(14, 45, 32);

        System.out.println("hour=" + t1.getHour() +
                ", minute=" + t1.getMinute() +
                ", second=" + t1.getSecond());

        t1.setTime(13, 20, 14);

        System.out.println(t1.toString());

        System.out.println(t1.nextSecond());
        System.out.println(t1.previousSecond());


    }
}
