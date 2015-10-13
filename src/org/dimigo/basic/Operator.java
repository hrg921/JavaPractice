package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int TrapezoidWidth1 = 9;
		int TrapezoidWidth2 = 10;
		double TrapezoidHeight = 5.8;
				
		int ParallelogramWidth = 10;
		double ParallelogramHeight = 5.4;
		
		double extentTrapezoid = ((TrapezoidWidth1 + TrapezoidWidth2) * TrapezoidHeight)/2;
		double extentParallelogram = ParallelogramWidth * ParallelogramHeight;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + extentTrapezoid);
		System.out.println("평행사변형 넓이 : " + extentParallelogram);
		
		double difference = extentTrapezoid - extentParallelogram;
		
		System.out.println(extentTrapezoid>extentParallelogram ? "사다리꼴이 평행사변형 보다  "+ difference + " 더 큽니다."
				: "평행사변형이 사다리꼴보다 " + (-difference) + " 더 큽니다.");
	}

}
