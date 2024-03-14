package 논리3_문제_랜덤;

import java.util.Random;

public class 논리3_문제07_철수암호5_정답 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 암호숫자를 만들었다. 
				암호숫자의 규칙은 숫자5가 하나라도 들어가있으면 통과이다. 
	
				랜덤으로 100~999 사이의 숫자를 저장하고,
				그 숫자가 철수의 암호와 일치하면 true 를 출력하는 식을 작성하시오.
				
			[예시]
				랜덤 : 285
				true
		*/
		Random ran = new Random();
		
		int a = ran.nextInt(900) + 100;
	
		int b = (a / 100);
		int c = (a % 100 / 10);
		int d = a % 10;
	
		boolean e = b == 5 || c == 5 || d == 5;

	}

}
