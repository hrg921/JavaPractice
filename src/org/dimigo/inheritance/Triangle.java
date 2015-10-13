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
public class Triangle extends Figure {

    private int width;
    private int height;

    public Triangle(int width, int height) {
        super(0, 0);
        this.width = width;
        this.height = height;
    }

    public Triangle(int centerX, int centerY, int width, int height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calcArea() {
        return width * height * 0.5;
    }

    @Override
    protected void printCenter() {
        System.out.print("삼각형 ");
        super.printCenter();
    }
}
