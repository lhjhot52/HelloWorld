package co.edu.variable;

import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		// 입력값을 num1, num2, num3
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = scn.nextInt(); // 사용자입력값을 읽고 int형 반환.
		System.out.println("두번째 정수를 입력하세요.");
		num2 = scn.nextInt(); // 사용자입력값을 읽고 int형 반환.
		System.out.println("세번째 정수를 입력하세요.");
		num3 = scn.nextInt(); // 사용자입력값을 읽고 int형 반환.
		
		
		// 정수 연산 => 정수. 10, 15, 15 =>40/3.0 => 13
		double avg;
		avg = (num1+num2+num3)/3.0;
		System.out.printf("입력한 세정수는 %d,%d,%d 이고 평균은 %.2f 입니다.", num1, num2, num3, avg);
		
		// 결과값 : 입력한 세정수는 10, 15, 15, 이고 평균은 13.33333 입니다.
	}

}
