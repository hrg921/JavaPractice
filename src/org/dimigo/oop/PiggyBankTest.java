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
public class PiggyBankTest {

    public static void main(String[] args) {
        FamilyMember father = new FamilyMember("아빠");
        FamilyMember mother = new FamilyMember("엄마");
        FamilyMember me = new FamilyMember("나");
        FamilyMember brother = new FamilyMember("남동생");

        PiggyBank piggybank = new PiggyBank();

        FamilyMember.printMemberCnt();

        PiggyBank.putMoney(father, 10000);
        PiggyBank.putMoney(mother, 5000);
        PiggyBank.putMoney(me, 2000);
        PiggyBank.putMoney(brother, 1000);

        PiggyBank.printBalance();

        PiggyBank.putMoney(me, 1000);

        PiggyBank.printBalance();
    }
}
