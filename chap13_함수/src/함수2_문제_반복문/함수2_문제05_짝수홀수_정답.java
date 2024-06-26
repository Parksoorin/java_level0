package 함수2_문제_반복문;

import java.util.Random;

public class 함수2_문제05_짝수홀수_정답 {

	public static void solution(int num) {
		if(num % 2 == 0) {
			System.out.println(num + ":" +"짝수");
		}
		else {
			System.out.println(num + ":" +"홀수");
		}
	}
	
	public static void main(String[] args) {
		 /*
	          [문제] 
	            1~100 사이의 숫자를 랜덤으로 저장하고 
	            그 수가 짝수인지 홀수인지 출력하는 함수를 만드시오.
	            위 식을 10번 반복하시오.
	        [예시]
	            6 : 짝수
	            98 : 짝수
	            15 : 홀수
	            11 : 홀수
	            32 : 짝수
	            2 : 짝수
	            62 : 짝수
	            8 : 짝수
	            78 : 짝수
	            63 : 홀수
		  */
		Random ran = new Random();
		for(int i = 0; i < 10; i++) {
			int r = ran.nextInt(100) + 1;
			solution(r);
		}
	}
}
