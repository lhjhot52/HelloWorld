package co.edu.variable;

public class VarExample2 {
    public static void main(String[] args) {
		// 국어 80, 영어 70, 수학 69
    	// 평균 변수 선언.
    	int koreanScore = 80;
    	int engScore = 70;
    	int mathScore = 69;
    	
    	int result = koreanScore+engScore+mathScore;
    	
    	koreanScore = 85;
    	engScore = 75;
    	mathScore = 60;
    	
    	result = koreanScore+engScore+mathScore;
    	
    	double avg = (85 + 75 + 60) / 3.0 ;
    	
    	System.out.println("국어점수는"+koreanScore+"영어점수는"+engScore+"수학점수는"+mathScore+"평균은"+avg);
	}
    
}

