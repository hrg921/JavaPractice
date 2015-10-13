/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hangeonho on 15. 9. 24..
 */
public class MelonChart {

    public static void main(String[] args) {

        List<Music> musics = new ArrayList<>();

        musics.add(new Music("바람이나 좀 쐐", "개리"));
        musics.add(new Music("보통연애", "박경"));
        musics.add(new Music("취향저격", "iKON"));

        System.out.println("-- << 멜론 차트 >> --");
        printList(musics);

        System.out.println("-- << 2위 곡 추가 >> --");
        musics.add(1, new Music("레옹", "이유갓지"));
        printList(musics);

        System.out.println("-- << 3위 곡 변경 >> --");
        musics.set(2, new Music("맙소사", "황태지"));
        printList(musics);

        System.out.println("-- << 4위 곡 삭제 >> --");
        musics.remove(3);
        printList(musics);

        System.out.println("-- << 전체 리스트 삭제 >> --");
        musics.clear();
        printList(musics);
    }

    public static void printList(List<Music> musics) {
        for(Music music: musics) {
            System.out.println(musics.indexOf(music) + 1 + ". " + music.toString());
        }
        System.out.println();
    }

}
