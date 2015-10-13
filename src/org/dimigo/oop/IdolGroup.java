/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.oop;

/**
 * Created by hangeonho on 15. 5. 28..
 */
public class IdolGroup {

    public static void main(String[] args) {
        String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
        String[][] members = {
                {"GD", "태양", "대성", "탑", "승리"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };

        // idolGroup의 배열요소 갯수와 member의 배열요소의 갯수는 연동된다고 간주하고 반복문을 실행한다

        for(int i = 0 ; i < idolGroup.length ; i++) {
            System.out.println(String.format("<< %s 멤버 >>", idolGroup[i]));
            for (int j = 0 ; j < members[i].length ; j++) {
                System.out.println(members[i][j]);
            }
            System.out.println();
        }
    }
}
