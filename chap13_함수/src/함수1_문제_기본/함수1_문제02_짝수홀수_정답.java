package 함수1_문제_기본;

import java.util.Random;

public class 함수1_문제02_짝수홀수_정답 {
	/*
		[문제]
            a 변수에 1부터 10 사이의 랜덤 숫자를 저장하고, 
            "짝수" 또는 "홀수"를 출력하시오.
	*/
	public static void solution(int a) {
		 if(a % 2 == 0) {
			System.out.println("짝수");
		}
		  if(a % 2 == 1) {
			System.out.println("홀수");
		}
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int number = ran.nextInt(2);
		solution(number);
	}

}
