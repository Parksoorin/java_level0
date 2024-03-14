package 논리3_개념_랜덤;

import java.util.Random;

public class 논리3_개념02_철수암호2 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 암호숫자를 만들었다. 
				암호숫자의 규칙은 한자리의 숫자는 짝수이고 , 
				다른한자리의 숫자는 홀수이면 통과 이다.
				반대의 순서도 상관없다. 
				랜덤으로 10~99 사이의 숫자를 저장하고, 
				그숫자가 철수의 암호와 일치하면 true 를 출력하는 식을 작성하시오.
			[예시]
				랜덤 : 21
				true
		*/
		Random ran = new Random();
		int a = ran.nextInt(90) + 10;
	
		int b = (a / 10);
		int c = a % 10;
	
		boolean d = (a % 2 == 0 && b % 2 == 1);
		boolean e = (a % 2 == 1 && b % 2 == 0);
		boolean f = d || e ;

	}

}
