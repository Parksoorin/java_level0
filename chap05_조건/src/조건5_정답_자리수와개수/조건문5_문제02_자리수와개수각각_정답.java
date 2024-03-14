package 조건5_정답_자리수와개수;

import java.util.Random;

public class 조건문5_문제02_자리수와개수각각_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  
				랜덤(100~999)숫자를 저장한후, 각각의 자리수를 저장한다. 		
				각가의 자리수중에서 3의 개수와 5의 개수가 각각 몇개씩 있는지 출력하시오.
			[예시]
				353
				3 : 2
				5 : 1
			
		*/
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		
		Random ran = new Random();
		a = ran.nextInt(900) + 100;
		System.out.println(a);
		
		b = a / 100;
		c = a % 100 / 10;
		d = a % 10;
		

		if(b == 3){
			e = e + 1;
		}
		if(c == 3){
			e = e + 1;
		}
		if(d == 3){
			e = e + 1;
		}

		if(b == 5){
			f = f + 1;
		}
		if(c == 5){
			f = f + 1;
		}
		if(d == 5){
			f = f + 1;
		}

		System.out.println("3 : " + e);
		System.out.println("5 : " + f);


	}

}
