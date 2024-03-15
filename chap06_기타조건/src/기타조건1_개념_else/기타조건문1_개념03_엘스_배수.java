package 기타조건1_개념_else;

import java.util.Random;

public class 기타조건문1_개념03_엘스_배수 {
	public static void main(String[] args) {
		
		/*
			[문제]
				변수에 1~100 사이의 숫자를 랜덤으로 저장한다.
				해당 숫자의 값이 4의 배수이면 o,
				4의배수가 아니면 x 출력하시오.
		*/
		Random ran = new Random();
	
		int num = 0;
		num = ran.nextInt(100) + 1;
		System.out.println("num = " + num);
	
		if(num % 4 == 0) {
			System.out.println("o");
		} else {
			System.out.println("x");
		}
			
	}
}
