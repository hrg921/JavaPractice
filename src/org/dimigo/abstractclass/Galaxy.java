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
public class Galaxy extends SmartPhone {

    public Galaxy() {
        super("갤럭시 S6", "삼성", 650000);
    }

    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }

    public void pay() {
        System.out.println("삼성 페이로 결제합니다.");
    }

    public void useWirelessCharging() {
        System.out.println("무선 충전 기능을 사용합니다.");
    }

}
