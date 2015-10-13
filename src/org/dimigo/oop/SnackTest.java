/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 5. 18..
 */
public class SnackTest {

    public static void main(String[] args) {
        Snack[] snacks = new Snack[]{
                new Snack("새우깡", "농심", 1100, 2),
                new Snack("콘칲", "크라운", 1200, 1),
                new Snack("허니버터칩", "해태", 1500, 4)
        };

        int sum = 0;

//        snacks[0].printSnack();
//        snacks[1].printSnack();
//        snacks[2].printSnack();
//
//        sum = snacks[0].calcPrice() + snacks[1].calcPrice() + snacks[2].calcPrice();

        for(Snack snack: snacks) {
            snack.printSnack();
            sum += snack.calcPrice();
        }

        System.out.println("총 구매 금액 : " + String.format("%,d", sum) + "원");

    }

}
