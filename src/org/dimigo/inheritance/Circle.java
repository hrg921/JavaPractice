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
public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        super(0, 0);
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius) {
        super(centerX, centerY);
        this.radius = radius;
    }

    @Override
    protected double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected void printCenter() {
        System.out.print("원 ");
        super.printCenter();
    }
}
