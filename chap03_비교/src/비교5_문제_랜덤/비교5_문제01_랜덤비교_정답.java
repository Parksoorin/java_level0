package 비교5_문제_랜덤;

import java.util.Random;

public class 비교5_문제01_랜덤비교_정답 {

	public static void main(String[] args) {
		/*
			[문제]
				변수에 1000~9000 사이의 숫자를 한개 저장한후, 
				일의 자리와 십의 자리수가 같으면 true 가 나오는 식을 작성하시오.
			[예시]
				1354
				false
		*/
		Random ran = new Random();
		int a = ran.nextInt(8001) + 1000;
		int b = (a % 100 / 10);
		int c = a % 10;

		boolean d = b == c;
	}

}
