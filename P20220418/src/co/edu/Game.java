package co.edu;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] intAry = new int[5]; 
		 
		for(int i = 0; i < intAry.length ; i++){

		    intAry[i] = (int)(Math.random() * 5) + 1;
		 
		    
		    for(int j = 0; j < i; j ++){
		        if(intAry[i] == intAry[j]){
		            i--; 
		            break; 
		        }
		    }
		}
		System.out.println("임의의 값");
		for (int j = 0; j <intAry.length; j++) {
			System.out.println("["+ intAry[j]+"]");
		}
		while(true) {
			int select = scn.nextInt();
			if(intAry[select-1]==5) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}



	


