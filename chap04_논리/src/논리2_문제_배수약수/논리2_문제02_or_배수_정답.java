package 논리2_문제_배수약수;

public class 논리2_문제02_or_배수_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				변수 a의값에서 
				천의 자리수가 홀수이거나, 일의 자리수가 짝수이면,
				true 출력하시오.
			[정답]
				true
		*/
	
		int a = 3640;
	
		int b = (a / 1000);
		int c = a % 10;
	
		boolean result = b % 2 == 1 || c % 2 == 0;

	}

}
