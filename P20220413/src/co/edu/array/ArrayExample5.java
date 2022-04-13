package co.edu.array;

import java.util.Scanner;

public class ArrayExample5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lowscore = 100;
		int highscore = 0;
		int[] scores = new int[5];
	    
		for(int i=0; i<scores.length;i++) {
			System.out.println("학생점수를 입력>>>>>");
			scores[i] = scn.nextInt();
			if (scores[i] < lowscore) {
				lowscore = scores[i];
				}if (scores[i] > highscore) {
			    highscore = scores[i];
				
			}
			
		}
		System.out.println("최고점은"+highscore);
		System.out.println("최저점은"+lowscore);
		//학생이름, 점수
		//학생이름배열, 배열 0 => 학생, 90
		
		
		//학생중에 최고점, 최저점.
		
		//학생 5명의 점수를 담을수있도록 배열
	}

}
