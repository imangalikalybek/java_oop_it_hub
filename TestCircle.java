package com.company.oop;

// Imangali Kalybek

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea()
                + " and color of " + c1.getColor());

        Circle c2 = new Circle(2.0);

        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea()
                + " and color of " + c2.getColor());

        Circle c3 = new Circle(3.0, "blue");

        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea()
                + " and color of " + c3.getColor());

        //Circle класса нет main()метода. Следовательно, его нельзя запустить напрямую.
        //Если переменные private, то без геттеры и сеттеры мы не можем получить доступ!

        Circle c4 = new Circle();
        c4.setRadius(4.4);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        System.out.println (c6.toString ());
        System.out.println (c6);
        System.out.println ("Оператор '+' также вызывает toString ():" + c6);

        Circle c7 = new Circle(7.0);
        System.out.println("radius = "
                + c7.getRadius() + ", area = " + c7.getArea()
                + ", color = " + c7.getColor()
                + ", circumference = " + c7.getCircumference());


    }
}
