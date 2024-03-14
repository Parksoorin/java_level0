package 비교4_문제_자리수;

public class 비교4_문제07_천의자리배수_정답 {

	public static void main(String[] args) {
		 /*
	        [문제] 
	            아래 변수의 a의 값이 
	            천의 자리가 3의 배수이면 true 가 나오는 식을 작성하시오.
	        [정답]
	            true
	    */
	   
	    int a = 3346;
	
	    int b = (a / 1000);
	    boolean c = (b % 3 == 0);

	}

}
