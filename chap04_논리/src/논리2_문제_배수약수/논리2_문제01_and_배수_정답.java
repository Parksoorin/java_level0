package 논리2_문제_배수약수;

public class 논리2_문제01_and_배수_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				변수 a의값에서 
				백의 자리수가 6의 배수 이고, 십의 자리수가 짝수이면,
				true 출력하시오.
			[정답]
				true
		*/
	
		int a = 3640;
	
		int b = (a % 1000 / 100);
		int c = (a % 100 / 10);
	
		boolean result = b % 6 == 0 && c % 2 == 0;


	}

}
