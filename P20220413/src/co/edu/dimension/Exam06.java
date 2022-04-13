package co.edu.dimension;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) { // 학생수 입력.
				System.out.println("학생수를 지정하세요.");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
				
			}else if (selectNo == 2) { // 점수입력.
			for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
				
			}else if (selectNo == 3) { // 점수리스트.
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>"+scores[i]);
				}
			}else if (selectNo == 4) { // 분석.
				int maxVal, sum;
				maxVal = sum = 0; // 변수초기화.
				for(int i=0; i<scores.length; i++) {
				   sum += scores[i];
				   if(scores[i]>maxVal) {
					  maxVal = scores[i];
				   }
				}
				System.out.println("최고 점수: "+maxVal);
				System.out.printf("평균 점수: %.2f",(double)sum/scores.length);
			
			}else if (selectNo == 5) { // 종료.
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
