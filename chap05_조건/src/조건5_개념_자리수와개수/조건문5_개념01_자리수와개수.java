package 조건5_개념_자리수와개수;

import java.util.Random;

public class 조건문5_개념01_자리수와개수 {

	public static void main(String[] args) {
		/*
			[문제]	  
				랜덤(100~999)숫자를 저장한후, 각각의 자리수를 저장한다.
				각각의 자리수 마다 숫자5가 몇개 있는지 출력하시오.
			[예시]
				155
				2
		*/
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		
		Random ran = new Random();
		a = ran.nextInt(900) + 100;
		System.out.println(a);
		
		b = a / 100;
		c = a % 100 / 10;
		d = a % 10;
		
		if(b == 5) {
			e = e + 1;
		}
		if(c == 5) {
			e = e + 1;
		}
		if(d == 5) {
			e = e + 1;
		}

		System.out.println(e);
		
	}

}
