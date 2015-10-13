/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 8. 17..
 */
public class FigureTest {

    public static void main(String[] args) {

        Circle c = new Circle(5);
        Triangle t = new Triangle(10, 10, 5, 8);
        Rectangle r = new Rectangle(20, 20, 5, 8);

        System.out.println("원의 넓이 : " + String.format("%.1f", c.calcArea()));
        System.out.println("삼각형의 넓이 : " + t.calcArea());
        System.out.println("사각형의 넓이 : " + r.calcArea());

        System.out.println();

        c.printCenter();
        t.printCenter();
        r.printCenter();

        System.out.println();

        c.moveCenter(5, 5);
        t.moveCenter(5, 5);
        r.moveCenter(5, 5);

        System.out.println();

        c.printCenter();
        t.printCenter();
        r.printCenter();
    }

}
