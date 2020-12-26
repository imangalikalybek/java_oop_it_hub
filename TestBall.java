package com.company.oop;

// Imangali Kalybek

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(4, 4, 4, 2, 2);

        b1.setX(5);
        b1.setY(5);
        b1.setRadius(5);

        b1.move();

        b1.setxDelta(1);
        b1.setyDelta(1);

        System.out.println(b1.toString());

    }
}
