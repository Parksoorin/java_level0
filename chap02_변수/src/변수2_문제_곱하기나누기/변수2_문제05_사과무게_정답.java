package 변수2_문제_곱하기나누기;

public class 변수2_문제05_사과무게_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				사과 4개의 무게는 32g 이다. 
				사과 3개의 무게는 얼마인지 구하시오.
				소수점 2자리까지 구하시오.
			[정답] 
				24.00
			*/
		
			/*
				[풀이]
					사과 1개 무게
					= 사과4개 / 4
					= 32 / 4
		
					사과 3개 무게
					= 사과1개무게 * 3
					= (32 / 4) * 3
			*/
				
			double a = 32;
			double b = 4;
			double c = a / b;
			double d = 3;
			double result = c * d;
			System.out.println(String.format("%.2f", result));
		
	}

}
