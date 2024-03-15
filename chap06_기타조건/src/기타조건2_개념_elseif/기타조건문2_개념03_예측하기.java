package 기타조건2_개념_elseif;

public class 기타조건문2_개념03_예측하기 {
	public static void main(String[] args) {
	
	    /*
	        [문제]
	            다음 주석 안에 있는 식의 결과를 미리 예측해보고 실행하시오.
	        [정답]
	            a는 70 이하이다.
	    */
	
	    
	    int a = 63;
	
	    if(a <= 50) {
	
	        System.out.println("a는 50 이하이다.");
	
	    } else if(a <= 60) {
	
	        System.out.println("a는 60 이하이다.");
	
	    } else if(a <= 70) {
	
	        System.out.println("a는 70 이하이다.");
	
	    } else {
	        
	        System.out.println("else 구문이다.");
	    }
			
	}
}
