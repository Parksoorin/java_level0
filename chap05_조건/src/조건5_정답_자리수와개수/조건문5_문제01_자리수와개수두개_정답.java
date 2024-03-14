package 조건5_정답_자리수와개수;

import java.util.Random;

public class 조건문5_문제01_자리수와개수두개_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  		
				랜덤(100~999)숫자를 저장한후, 각각의 자리수를 저장한다.
				각각의 자리수 마다 숫자5나 8이 몇개 있는지 출력하시오.
			[예시]
				855
				3
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
		
		if(b == 5 || b == 8) {
			e = e + 1;
		}
		if(c == 5 || c == 8) {
			e = e + 1;
		}
		if(d == 5 || d == 8) {
			e = e + 1;
		}

		System.out.println(e);
		

	}

}
