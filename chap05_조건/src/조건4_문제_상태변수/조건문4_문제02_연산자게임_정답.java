package 조건4_문제_상태변수;

import java.util.Random;

public class 조건문4_문제02_연산자게임_정답 {

	public static void main(String[] args) {
		/*
		[문제]
				랜덤숫자(1~10) 두개를 각각 a와 b 에저장한다. 
				새로운랜덤숫자(1~3)을 c에 저장한다.
				c의 값이 1이면 a 와 b의 합을 출력한다.
				c의 값이 2이면 a 에서 b를 뺀값을 출력한다.
				c의 값이 3이면 a 와 b의 곱을 출력한다. 
	
				
			[예시]
				a = 10
				b = 4
				c = 2
				답 : 6
		*/
	
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		Random ran = new Random();
		a = ran.nextInt(10) + 1;
		b = ran.nextInt(10) + 1;
		c = ran.nextInt(3) + 1;
		
		if(c == 1) {
			d = a + b;
		}
		if(c == 2) {
			d = a - b;
		}
		if(c == 3) {
			d = a * b;
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("답 = " + d);

	}

}
