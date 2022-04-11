package co.edu.variable;

public class OperatorExample {
	public static void main(String[] args) {
		// 나머지: %
		// 6/4 => 몫: 1, 나머지:
		
		// 75300 원.
		// 
		// 5만원 => ?개, 1만원 => ?개, 5천원 => ?개
		// 1천원 => ?개, 5백원 => ?개, 1백원 => ?개
	
	    // 75300원 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개.
		int won,oman,ilman,ochun,ilchun,obaek,ilbaek;
		won = 75300;
		oman = 50000;
		ilman = 10000;
		ochun = 5000;
		ilchun = 1000;
		obaek = 500;
		ilbaek = 100;
		
	
		int a = won / oman;
		
		int b = won % oman;
		
		int c = b / ilman;
		
		int d = b % ilman;
		
		int e = d / ochun;
		
		int f = d % ochun;
		
		int k = f / ilbaek;
		
		
		System.out.printf("오만원%d개,만원%d개,오천원%d개,백원%d개",a,c,e,k);
		
		
		
					
			
		}
	}
	


