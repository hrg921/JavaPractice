/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.abstractclass;

/**
 * Created by hangeonho on 15. 8. 28..
 */
public class SmartPhoneTest extends Galaxy {

    public static void main(String[] args) {

        SmartPhone[] s = {
                new IPhone(),
                new Galaxy()
        };
        
        for(SmartPhone phone : s) {
            System.out.println(phone);
            phone.turnOn();
            phone.pay();
            phone.useSpecialFunction();
            phone.turnOff();
            System.out.println();
            System.out.println();
        }

    }

}
