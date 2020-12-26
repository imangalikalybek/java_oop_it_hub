package com.company.oop;

// Imangali Kalybek

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(31, 12, 2020);

        System.out.println("day=" + d1.getDay() +
                ", month=" + d1.getMonth() +
                ", year=" + d1.getYear());

        d1.setDate(11, 03, 2021);

        System.out.println(d1.toString());


    }
}
