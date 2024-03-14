package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제09_랜덤숫자_정답 {

	public static void main(String[] args) {
	    /*
	        [문제]
	            랜덤으로 숫자 3이나 7을 출력하시오.
	    */
		
		int a = 0;
		int b = 0;
		
		Random ran = new Random();
		a = ran.nextInt(2) + 1;
		
		if(a == 1) {
			b = 3;
		}
		if(a == 2) {
			b = 7;
		}
		System.out.println(b);

	}

}
