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
public class AgeCheckException extends Exception {
    public AgeCheckException() {
        super("영화 관람 나이보다 나이가 낮습니다.");
    }

    public AgeCheckException(Movie movie) {
        super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
    }
}
