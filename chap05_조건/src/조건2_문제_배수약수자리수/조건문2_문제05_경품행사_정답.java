package 조건2_문제_배수약수자리수;

import java.util.Random;

public class 조건문2_문제05_경품행사_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  
				철수는 경품행사에 참가했다. 
				경품은 랜덤(100~999) 숫자를 하나 뽑고, 
				자리수 별로 저장한다.
				자리수의 각숫자가 
				전부 같은숫자이면 "당첨"
				아니면 "꽝" 을 출력하시오.
			[예시]
				155
				꽝
		*/
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		Random ran = new Random();
		a = ran.nextInt(900) + 100;
		System.out.println(a);
		
		b = a / 100;
		c = a % 100 / 10;
		d = a % 10;
		if(b == c && c == d && d == b) {
			System.out.println("당첨");
		}
		if(b != c || c != d || d != b) {
			System.out.println("꽝");
		}
	}

}
