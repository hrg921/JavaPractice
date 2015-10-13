package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		long salary = 1700000L;
		int employees = 3;
		int shops = 1500;
		
		System.out.println("<< 디미배네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary) + "원");
		System.out.println("점포 내 직원  : " + employees + "명");
		System.out.println("점포  : " + String.format("%,d", shops)  + "개");
		
		System.out.println("\n");
		
		long total = (long)(salary * 12 * employees * shops);
		
		System.out.println("연간 인건비 : " + String.format("%,d", total) + "원");
	}
}
