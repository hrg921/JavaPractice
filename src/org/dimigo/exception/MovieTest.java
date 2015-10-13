/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.dimigo.exception;

/**
 * Created by hangeonho on 15. 9. 23..
 */
public class MovieTest {

    public static void main(String[] args) {
//        try {
        Movie[] movies = {
                new Movie("베테랑", 15), new Movie("앤트맨", 12), new Movie("사도", 12)
        };
        int age = 13;
        for(Movie movie : movies) {
            try {
                buyTicket(movie, age);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }

    private static void buyTicket(Movie movie, int age) throws Exception {
        if(age < movie.getLimitAge())
            throw new AgeCheckException(movie);
        else
            System.out.println(movie.getTitle() + " 영화 즐감하세용~~");
    }
}
