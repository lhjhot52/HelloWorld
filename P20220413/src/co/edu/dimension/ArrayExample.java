package co.edu.dimension;

public class ArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[4][3];
		
		intAry[0][0] = 10;
		intAry[1][0] = 20;
		intAry[3][2] = 100;
		
		for(int j=0; j<intAry.length; j++)
		for(int i=0; i<intAry[j].length; i++) {
			System.out.print("["+j+"]"+"["+i+"] => "+ intAry[j][i]);
		}
		System.out.println();

	    int[][] intAry = new int [5][5];
	    for (int i=1; i<5; i++)
		for (int j=1; j<5; j++) {
			
			System.out.printf("%3d",intAry[i][j]);
		}
        
}
}