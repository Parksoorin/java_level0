package 논리3_문제_랜덤;

import java.util.Random;

public class 논리3_문제01_가장큰수_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				아래 변수 a, b, c 중에서 a에 가장 큰 수가 저장되어 있는지 확인한다.
				각각의 변수에 랜덤값 1~9 를 저장하고,
				a가 가장 큰 수이면 true를 출력하도록 식을 만드시오.
				
			[정답]
				true
		*/
		Random ran = new Random();
		
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		int c = ran.nextInt(9) + 1;
	
		boolean result = b < a && a > c;

	}

}
