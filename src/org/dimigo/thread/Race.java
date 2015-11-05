/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.thread;

/**
 * Created by hangeonho on 15. 11. 5..
 */
public class Race {

    public static void main(String[] args) {
        Thread runner1 = new Runner("홍길동");
        Thread runner2 = new Runner("홍길순");

        System.out.println("main thread start");

        runner1.setPriority(Thread.MAX_PRIORITY);
        runner2.setPriority(Thread.MAX_PRIORITY);

        runner1.start();
        runner2.start();

        System.out.println("main thread stop");
    }
}
