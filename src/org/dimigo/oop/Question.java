/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Question
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author hangeonho
 * @version 1.0.0
 * 
 */

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string;
		
		String answer1 = "윤현상";
		String answer2 = "진세연";
		String answer3 = "자바";
		
		System.out.println("가장 좋아하는 가수는 ? ");
		string = scanner.nextLine();
		if(answer1.equals(string)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! TT");
		}
		
		System.out.println();
		
		System.out.println("가장 좋아하는 배우는 ? ");
		string = scanner.nextLine();
		if(answer2.equals(string)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! TT");
		}
		
		System.out.println();
		
		System.out.println("가장 좋아하는 과목은 ? ");
		string = scanner.nextLine();
		if(answer3.equals(string)) {
			System.out.println("정답입니다!! ^^");
		}
		else {
			System.out.println("틀렸습니다!! TT");
		}
		
		System.out.println();

	}

}
