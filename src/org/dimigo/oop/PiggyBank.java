/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 6. 15..
 */
public class PiggyBank {
    static int balance = 0;

    public static void putMoney(FamilyMember member, int amount) {
        System.out.println(member.getMemberName() + " " + amount + "원 넣음");
        balance += amount;
    }

    public static void printBalance() {
        System.out.println("돼지저금통 총 금액 : " + balance + "원");
    }

    public static void stillMoney(FamilyMember member, int amount) {
        if(amount <= balance) {
            System.out.println(member.getMemberName() + " " + amount + "원 빼감");
            balance -= amount;
        } else {
            System.out.println("돈이 모자람!!!");
        }
    }
}
