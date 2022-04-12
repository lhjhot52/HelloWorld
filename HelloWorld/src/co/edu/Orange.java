import java.util.Scanner;

public class Orange {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int orange,ten,five;
		
		orange = 127;
		ten = 10;
		five = 5;
		
		int a = orange / ten;
		int b = orange % ten;
		int c = b / five;
		
		System.out.printf("오렌지 %d개,10개씩담을수있는상자 %d개,5개씩 담을수있는상자 %d개",orange,a,c);
	}

}
