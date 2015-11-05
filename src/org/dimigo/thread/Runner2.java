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
public class Runner2 implements Runnable{

    private String name;

    public Runner2() {}

    public Runner2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " 출발");
        for(int i = 0; i < 11; i ++) {
            System.out.println(name + " " + (10 - i) * 10 + " 미터");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " 골인");
    }

}
