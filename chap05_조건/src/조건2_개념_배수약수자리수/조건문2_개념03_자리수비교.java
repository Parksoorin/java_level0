package 조건2_개념_배수약수자리수;

import java.util.Random;

public class 조건문2_개념03_자리수비교 {

	public static void main(String[] args) {
		
		/*
			[문제]	  
				[1] 10000~90000 사이의 랜덤 숫자2개를 저장한다.
				[2] 랜덤숫자각각 자리수 중에서 백의 자리를 저장한다.
				[3] 랜덤 숫자의 백의자리 숫자를 비교해서 백의자리가 더큰 숫자 전체를 출력한다.
				[4] 서로 같으면 "같다" 을 출력한다.
			[예시]
				[랜덤1] : 24912  
				[랜덤2] : 51223 
				[출력] : 24912
		*/
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		Random ran = new Random();
		a = ran.nextInt(80001) + 10000;
		b = ran.nextInt(80001) + 10000;
		
		c = a % 1000 / 100;
		d = b % 1000 / 100;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		if(c > d) {
			System.out.println(a);
		}
		if(c < d) {
			System.out.println(b);
		}
		if(c == d) {
			System.out.println("같다");
		}
	}

}
