package 기타조건1_문제_else;

import java.util.Random;

public class 기타조건문1_문제06_랜덤숫자_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            랜덤으로 숫자 3이나 7을 출력하시오.
	            단, else 를 사용하시오.
	    */
		Random ran = new Random();

		int a = 0;
		int b = 0;
		
		a = ran.nextInt(2) + 1;
		System.out.println(a);
		
		if(a == 1) {
			b = 3;
		} else {
			b = 7;
		}
		
		System.out.println(b);
		
	}
}
