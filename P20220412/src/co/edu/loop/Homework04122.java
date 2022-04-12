package co.edu.loop;

import java.util.Scanner;

public class Homework04122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		   System.out.println("가위(1),바위(2),보(3)중에 고르세요");
		   int com = (int)(Math.random()*3)+1;
		   int me = sc.nextInt();
		   if(com == 1 && me == 2) {
			   System.out.println("You Win.");
			   System.out.println("컴퓨터는 가위를냈어요.");
			   continue;
		   }else if(com == 2 && me == 3) {
			   System.out.println("You Win.");
			   System.out.println("컴퓨터는 주먹을냈어요.");
			   continue;
		   }else if(com == 3 && me == 1) {
			   System.out.println("You Win.");
			   System.out.println("컴퓨터는 보를냈어요.");
			   continue;
		   }else {
			   System.out.println("You lose.");
			   break;
		   }
	    }
    }
}
		
