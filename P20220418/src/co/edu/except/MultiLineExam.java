package co.edu.except;

import java.util.Scanner;

public class MultiLineExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "";
		
	
		while(true) {
		   String temp = scn.nextLine() + "\n";
		   if(str.equals("exit")) {
			   break;
		  }	
		   str += temp + "\n";
		}
		System.out.println(str.toString());
	}

}
