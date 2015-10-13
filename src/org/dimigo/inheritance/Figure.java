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
public class Figure {

    private int centerX;
    private int centerY;

    public Figure(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    protected double calcArea() {
        return 0.0;
    }

    protected void printCenter() {
        System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
    }

    protected void moveCenter(int dx, int dy) {
        this.centerX += dx;
        this.centerY += dy;
    }
}
