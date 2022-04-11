package co.edu.variable;

import java.util.Scanner;

public class ChangeCToF {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double c;	
		int f;
		System.out.println("화씨온도를 입력하세요.");
		f = scn.nextInt(); 
		
		c = 5/9.0*(f-32);
		System.out.printf("화씨온도 %2d는 섭씨온도 %.2f",f,c);
		
		
		
		
	}

}
