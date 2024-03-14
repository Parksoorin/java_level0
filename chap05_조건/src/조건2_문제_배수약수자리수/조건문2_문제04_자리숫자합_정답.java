package 조건2_문제_배수약수자리수;

import java.util.Random;

public class 조건문2_문제04_자리숫자합_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  
				[1] 10000~90000 사이의 랜덤 숫자 저장한다.
				[2] 각가의 자리수를 저장한후 , 두 번째 자리와 네 번째 자릿수의 합을구하시오. 
				[3] 그합이 짝수이면 "짝수"를 출력하시오.
				[4] 그합이 홀수이면 "홀수"를 출력하시오.
			
			[예시]
					랜덤숫자 : 45343
					두 번째 자릿수 : 5
					네 번째 자릿수 : 4
					합 : 9
					홀수
		*/

		int a = 0;
		int b = 0;
		int c = 0;
		int result = 0;
		
		Random ran = new Random();
		a = ran.nextInt(80001) + 10000;
		System.out.println("a = " + a);
		
		b = a % 10000 / 1000;
		System.out.println("두 번째 자릿수 = " + b);
		
		c = a % 100 / 10;
		System.out.println("네 번째 자릿수 = " + c);
		
		result = b + c;
		System.out.println("합 = " + result);
		
		if(result % 2 == 0) {
			System.out.println("짝수");
		}
		if(result % 2 == 1) {
			System.out.println("홀수");
		}
		
	}

}
