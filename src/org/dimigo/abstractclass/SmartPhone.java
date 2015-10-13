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
public abstract class SmartPhone {

    private String model;
    private String company;
    private int price;

    public SmartPhone() {}
    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void turnOn() {
        System.out.println(model + "의 전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println(model + "의 전원을 끕니다.");
    }

    public abstract void pay();
    public void useSpecialFunction() {
        if(this instanceof IPhone)
            ((IPhone) this).useAirDrop();
        else if(this instanceof Galaxy)
            ((Galaxy) this).useWirelessCharging();
    }

    public String toString() {
        return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price) + "원";
    }
}
