package 비교4_문제_자리수;

public class 비교4_문제04_십의자리약수_정답 {

	public static void main(String[] args) {
		 /*
	        [문제] 
	            아래 변수의 a의 값이 
	            10의 자리가 45의 약수이면 true 가 나오는 식을 작성하시오.
	        [정답]
	            false
	    */
	
	    int a = 3340;
	
	    int b = (a % 100 / 10);
	    boolean c = (45 % b == 0);

	}

}
