package co.edu.variable;

public class Homework2 {
	public static void main(String[] args) {
		int cashe = 10000;
		int product = 7500;
		int VAT = (int) (product * 0.1);
		product = product - VAT;
		int changes = cashe - (product + VAT);
		
		System.out.println("현금 "+cashe+"원");
		System.out.println("물건 "+product+"원");
		System.out.println("부가세 "+VAT+"원");
		System.out.println("잔돈 "+changes+"원");
	}

}
