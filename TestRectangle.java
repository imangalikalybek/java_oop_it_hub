package com.company.oop;

// Imangali Kalybek

public class TestRectangle {
    public static void main(String[] args) {
     Rectangle r1 = new Rectangle(3.0f, 4.0f);

        System.out.println("length=" + r1.getLength() +
                ", width = " + r1.getWidth());

     r1.setLength(6);
     r1.setWidth(7);

     System.out.println(r1.toString());
     System.out.println("Area = " + r1.getArea() +
             ", Perimeter = " + r1.getPerimeter());

    }
}
