package co.edu;

public class CalExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		c1.printPI();
		c1.getArea(2.4);
		
		int result = c1.sum(30, 23);
		System.out.println("두수의 합: " + result);
		double result1 = c1.getTriangleArea(24.0,15.5);
		System.out.println("삼각형의 넓이"+result1);
		// 삼각형의 너비는 xxx 입니다.
		int[] intAry = { 10, 20, 30, 40 };
		result = c1.sum(intAry);
		System.out.println("배열의 합: "+result);
		//
	    result1 = c1.average(10,20,25);
		System.out.println("평균: "+result1);
		
		result1 = c1.average(10, 20, 30 ,33, 22, 55);
		System.out.println("평균: "+result1);
		
		
		
	}
}
