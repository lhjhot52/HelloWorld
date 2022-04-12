package co.edu.condition;



public class IfExample2 {
	public static void main(String[] args) {
	   
	    int num = 12;
	    
	    if ((num % 2 == 0) && (num % 3 == 0)){
	    	System.out.println("12는 2,3의 공통배수입니다.");
	    }
	    else if (num % 2 == 0) {
	    	System.out.println("12는 2의배수입니다");
	    }
	    else if (num % 3 == 0) {
	    	System.out.println("12는 3의배수입니다");
	    }else {
	    	System.out.println("틀렸습니다");
	    }
	    	
	    int num1 =4;
	    
	    if (num1 % 2 ==0) {
	    	System.out.println("4는 2의배수입니다.");
	    }
	    
	    // 2의 배수인지 3의 배수,2,3의 공통배수인지.
	    // 4는 2의 배수입니다.
	}

}
