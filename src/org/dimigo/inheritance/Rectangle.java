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
public class Rectangle extends Figure {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(0, 0);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int centerX, int centerY, int width, int height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calcArea() {
        return width * height;
    }

    @Override
    protected void printCenter() {
        System.out.print("사각형 ");
        super.printCenter();
    }
}
