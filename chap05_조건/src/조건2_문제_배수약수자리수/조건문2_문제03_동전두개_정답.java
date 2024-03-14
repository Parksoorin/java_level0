package 조건2_문제_배수약수자리수;

import java.util.Random;

public class 조건문2_문제03_동전두개_정답 {

	public static void main(String[] args) {
	    /*
	        [문제]
	            동전의 앞과 뒤를 랜덤숫자 1 또는 2로 표현한다.
	            동전 두개를 던저서 동전이 둘다 홀수이면 "1등" 출력
	            동전 두개를 던저서 동전이 둘다 짝수이면 "2등" 출력
	            그외는 "꽝" 출력     
	        [예시]
	            1
	            2
	            꽝
	    */
		
		int a = 0;
		int b = 0;
		
		Random ran = new Random();
		a = ran.nextInt(2) + 1;
		b = ran.nextInt(2) + 1;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if(a % 2 == 1 && b % 2 == 1) {
			System.out.println("1등");
		}
		if(a % 2 == 0 && b % 2 == 0) {
			System.out.println("2등");
		}
		if(a != b) {
			System.out.println("꽝");
		}

	}

}
