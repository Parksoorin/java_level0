package 기타조건4_문제_삼항연산자;

import java.util.Random;

public class 기타조건문4_문제06_랜덤숫자_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            랜덤으로 숫자 3이나 7을 출력하시오.
	            단, 삼항연산자를 사용하시오.
	    */
		Random ran = new Random();
		
		 int a = 0;
		 int b = 0;
		 
		 a = ran.nextInt(2) + 1;
		 System.out.println(a);

	     b = a == 1 ? 3 : 7;
	     System.out.println(b);
		
	}
}
