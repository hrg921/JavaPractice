package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean gender = true; // true = 여자, false = 남자
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<< " + name + "프로필 >>");
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + Checkgender(gender) );
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("혈액형 : " + bloodType);
	}
	
	public static String Checkgender(boolean gender) {
		if(gender == true)
			return "여자";
		else
			return "남자";
	}

}
