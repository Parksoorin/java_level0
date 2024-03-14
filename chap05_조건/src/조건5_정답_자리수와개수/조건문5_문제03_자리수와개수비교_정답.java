package 조건5_정답_자리수와개수;

import java.util.Random;

public class 조건문5_문제03_자리수와개수비교_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  
				랜덤(100~999)숫자를 저장한후,
				각각의 자리수가 전부 짝수이면 모든숫자를 더한값을 출력.
				각각의 자리수가 전부 홀수이면 가장앞에수에서 나머지숫자들을 뺀값을 출력.
				위 두경우가 아니면 모든숫자를 곱한값을 출력.
			
			[예시1]	
				353
				-5
	
			[예시2]	
				343
				36
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
		
		if(b % 2 == 0){
			e = e + 1;
		}
		if(c % 2 == 0){
			e = e + 1;
		}
		if(d % 2 == 0){
			e = e + 1;
		}

		if(e == 3){
			f = b + c + d;
		}
		if(e == 0){
			f = b - c - d;
		}
		if(0 < e && e < 3){
			f = b * c * d;
		}
		
		System.out.println(f);
	}

}
