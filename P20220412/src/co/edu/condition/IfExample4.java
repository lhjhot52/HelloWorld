package co.edu.condition;

public class IfExample4 {
	public static void main(String[] args) {
		// 임의의 값을 생성해주는 Math.random().
		int randomVal =(int)(Math.random() * 50) + 51; // 반환값이 double 0 <= r값 < 1
	    System.out.println(randomVal);
	
	    // 생성된 값이 1 ~ 50 까지.
	    // 생성된 값이 51 ~ 60 까지.
	    // 61 ~ 70 , 71 ~ 80 , 81 ~ 90, 91 ~ 100 범위.
	    if ((randomVal <= 1)&&(randomVal <=50)) {
	    	System.out.println("생성된 값은 1~50사이");
	    }else if ((randomVal <= 51)&&(randomVal <= 60)) {
	    	System.out.println("생성된 값은 51~60사이");
	    }else if ((randomVal <= 61)&&(randomVal <= 70)) {
	    	System.out.println("생성된 값은 61~70사이");
	    }else if ((randomVal <= 71)&&(randomVal <= 80)) {
	    	System.out.println("생성된 값은 71~80사이");
	    }else if ((randomVal <= 81)&&(randomVal <= 90)) {
	    	System.out.println("생성된 값은 81~90사이");
	    }else if ((randomVal <= 91)&&(randomVal <= 100)) {
	    	System.out.println("생성된 값은 91~100사이");
	    }else {
	    	System.out.println("틀린값");
	    }
	    





	   
	}
	
}
