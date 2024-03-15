package 기타조건4_문제_삼항연산자;

import java.util.Random;

public class 기타조건문4_문제02_경품행사_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]	  
				철수는 경품행사에 참가했다. 
				경품은 랜덤(100~999) 숫자를 하나 뽑고, 
				자리수 별로 저장한다.
				자리수의 각숫자가 
				전부 같은숫자이면 true
				아니면 false를 출력하시오.
				단, 삼항연산자 를 사용하시오.
			[예시]
				155
				false
		*/
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		boolean e = false;
		boolean result = false;
		
		Random ran = new Random();
		a = ran.nextInt(900) + 100;
		System.out.println(a);
		
		b = a / 100;
		c = a % 100 / 10;
		d = a % 10;
		System.out.println(a);

		e = b == c && c == d && d == b;

		result = e ? true : false;
		System.out.println(result);
		
	}
}
