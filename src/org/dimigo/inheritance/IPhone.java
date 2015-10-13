/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.inheritance;

/**
 * Created by hangeonho on 15. 8. 28..
 */
public class IPhone extends SmartPhone{

    public IPhone() {
        super("iPhone 6", "애플", 700000);
    }

    public IPhone(String model, String company, int price) {
        super(model, company, price);
    }

    public void pay() {
        System.out.println("애플 페이로 결제합니다.");
    }

    public void useAirDrop() {
        System.out.println("AirDrop기능을 사용합니다.");
    }
}
