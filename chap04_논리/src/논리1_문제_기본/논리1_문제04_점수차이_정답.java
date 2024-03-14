package 논리1_문제_기본;

public class 논리1_문제04_점수차이_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 국어 80점
				민수는 국어 87점
				두 학생의 점수 차이는 7이거나 -7이다. 	
				위 식을 논리연산자로 표현하시오.
		*/
	
		int a = 80;
	
		int b = 87;
	
		int c = a - b;
	
		boolean result = c == 7 || c == -7;


	}

}
