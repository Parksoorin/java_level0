package 논리3_문제_랜덤;

import java.util.Random;

public class 논리3_문제02_전부같은수_정답 {
	public static void main(String[] args) {

		/*
			[문제]
				아래 변수 a, b, c 중에서 a에 가장 큰 수가 저장되어 있는지 확인한다.
				각각의 변수에 랜덤값 1~9 를 저장하고,
				전부 같은수이면 true 를 출력하는 식을 만드시오. 
				
			[정답]
				3 3 3
				true
		*/
		Random ran = new Random();
		
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		int c = ran.nextInt(9) + 1;

		boolean d = a == b && b == c;

	}
}
