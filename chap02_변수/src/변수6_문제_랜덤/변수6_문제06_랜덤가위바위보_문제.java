package 변수6_문제_랜덤;

import java.util.Random;

public class 변수6_문제06_랜덤가위바위보_문제 {

	public static void main(String[] args) {
		/*
	        [문제]
	            철수와 민수는 가위바위보 놀이를 하고있다.
	
	            철수는 민수와 가위바위보에서 3번 이기고 2번 비기고 4번졌다. 
	
	            랜덤숫자(1~6)을 변수에 저장후 그 
	            랜덤숫자에 이긴숫자만큼 곱하고 
	            비긴숫자만큼 더하고 
	            진숫자만큼 뺀수를 출력하시오.
	
	        [예시]
	            랜덤숫자 : 4
	            결과 : 10
	            	4 * 3 + 2 - 4;
	    */
		
		Random ran = new Random();
		
		int a = ran.nextInt(6) + 1;
		System.out.println(a);
		
		System.out.println(a * 3 + 2 - 4);

	}

}
