package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String type = "고속버스";
		int distance = 10;
		int money;
		
		switch (type) {
		case "고속버스":
			money = 850 + (distance % 10 == 0 ? 300 * (distance / 10 - 1) : 300 * (distance / 10));
			break;
		case "경차":
			money = 300 + (distance % 10 == 0 ? 200 * (distance / 10 - 1) : 200 * (distance / 10));
			break;
		default:
			money = 600 + (distance % 10 == 0 ? 200 * (distance / 10 - 1) : 200 * (distance / 10));
			break;
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + type);
		System.out.println("통행료 : " + money + "원");
	}

}