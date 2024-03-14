package 논리3_개념_랜덤;

import java.util.Random;

public class 논리3_개념01_철수암호1 {

	public static void main(String[] args) {
		/*
			[문제] 
				철수는 암호숫자를 만들었다. 
				암호숫자의 규칙은 모든자리의 숫자가 짝수이면 통과 이다.
				랜덤으로 100~999 사이의 숫자를 저장하고, 
				그숫자가 철수의 암호와 일치하면 true 를 출력하는 식을 작성하시오.
			[예시]
				랜덤 : 284
				true
		*/
		Random ran = new Random();
	
		int a = ran.nextInt(899) + 100;
	
		int b = (a / 100);
		int c = (a % 100 / 10);
		int d = a % 10;
	
	
		/*
			랜덤문제들은 원하는 결과가 나올때까지 반복해야해서 불편할때가 있다.
			아래와 같이 임의 값을 넣어서 테스트 해보고 테스트가 다 잘통과하면 주석처리한다.
		*/
		/*
			a = 284;
			b = 2;
			c = 8;
			d = 4;
		*/
	
		boolean e = b % 2 == 0 && c % 2 == 0 && d % 2 == 0;

	}

}
