package 조건2_개념_배수약수자리수;

import java.util.Random;

public class 조건문2_개념01_배수 {

	public static void main(String[] args) {
		
		/*
	        [문제]
	            변수에 1부터 100 사이의 랜덤 숫자를 저장한다.
	            저장한 숫자의 값이 4의 배수이면 "o"
	            4의 배수가 아니면 "x" 출력하시오.
	    */
		int a = 0; 
		
		Random ran = new Random();
		a = ran.nextInt(100) + 1;
		System.out.println(a);
		
		if(a % 4 == 0) {
			System.out.println("o");
		}
		if(a % 4 != 0) {
			System.out.println("x");
		}
	}

}
