package 변수6_문제_랜덤;

import java.util.Random;

public class 변수6_문제03_랜덤자리수1_문제 {
	public static void main(String[] args) {
	/*
		[문제]
	        랜덤숫자 1000~2000 사이의 숫자를 저장한다. 

	        [1] 랜덤숫자를 출력하시오.
	        [2] 랜덤숫자의 백의 자리의 숫자와 십의 자리의 숫자의 합을 출력하시오.
	    [예시]
	        1023
	   	 2
	*/
		
		Random ran = new Random();
		int a = ran.nextInt(1000) + 1000;
		System.out.println(a);
		
		int a100 = (a % 1000) / 100;
		int a10 = (a % 100) / 10;
		
		System.out.println(a100 + a10);
		

	}
}
