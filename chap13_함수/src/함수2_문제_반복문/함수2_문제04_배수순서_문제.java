package 함수2_문제_반복문;

import java.util.Random;

public class 함수2_문제04_배수순서_문제 {

	public static void solution(int r1 , int r2) {
		System.out.println(r1 * r2);
	}
	
	public static void main(String[] args) {
		/*
	        [문제] 
				랜덤숫자 (2 ~ 9) 사이의 숫자를 저장한다. 랜덤숫자는 구하려는 배수를 뜻한다.
				랜덤숫자 (4 ~ 8) 사이의 숫자를 저장한다. 위 배수의 순서를 뜻한다.
				랜덤숫자 의 배수를 출력하는데 그중에서 두번째 랜덤숫자의 순서의 배수만 출력한다.
	
			[예시] 2의 배수의 6번째 배열을 출력한다.
				2 6 		
				12
		*/
		
		Random ran = new Random();
		int a = ran.nextInt(8) + 2;
		int b = ran.nextInt(5) + 4;
		
		System.out.println(a + " " + b);
		
		solution(a, b);
	
	}
}
