package 논리2_문제_배수약수;

public class 논리2_문제03_and_약수_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				아래 변수의 a값이 
				100의 자리가 30의 약수 이고 10의 자리가 25의 약수이면,
				true 출력하시오.
			[정답]
				false	
		*/
	
		int a = 3340;
	
		int b = (a % 1000 / 100);
		int c = (a % 100 / 10);
	
		boolean d = 30 % b == 0 && 25 % c == 0;

	}

}
