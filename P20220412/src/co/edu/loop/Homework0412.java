package co.edu.loop;

import java.util.Scanner;

public class Homework0412 {
	public static void main(String[] args) {
		int randomVal = (int)((Math.random()*(6-1))+1);
		        Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("주사위는 어떤 숫자일까요 >>>>");
			int userVal = scn.nextInt();
			if (randomVal == userVal) {
				System.out.println("정답입니다.");
				break;
			}
			if(randomVal > userVal) {
				System.out.println("입력값보다 큽니다.");
			}else {
				System.out.println("입력값보다 작습니다.");
			}
		}
		System.out.println("정답은 "+randomVal);        
	}

}
