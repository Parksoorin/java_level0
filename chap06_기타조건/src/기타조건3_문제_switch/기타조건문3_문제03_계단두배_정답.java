package 기타조건3_문제_switch;

import java.util.Random;

public class 기타조건문3_문제03_계단두배_정답 {
	public static void main(String[] args) {
		
		/*
			[문제]
	            철수는 집앞에 산이 있다. 산은 계단이 100 개이다.
	            철수는 지금 50계단에 있다.
	            a의 값은 현재 철수위치이다. 
	            랜덤숫자(1~10)을 b 에 저장한다.
	            랜덤숫자(1~2) 를 c 에 저장한다.
	            c의 값이 1이면 철수는 계단위로 b만큼 이동하고,
	            c의 값이 2이면 철수는 계단아래로 b만큼 이동하는 식을 작성하시오. 
	            단, b가 짝수이면 두배만큼이동한다.
	
			[예시]
	            b = 6
	            c = 1
	            a = 62
			
		*/
		Random ran = new Random();
	
		int a = 50;
		int b = 0;
		int c = 0;
		
		b = ran.nextInt(10) + 1;
		c = ran.nextInt(2) + 1;

	    switch(c){
	        case 1 : 
	            a = a + b;
	            if(b % 2 == 0){
	                a = a + b;
	            }
	            break;
	        case 2:
	            a = a - b;
	            if(b % 2 == 0){
	                a = a - b;
	            }
	            break;
	    }

	    System.out.println(a + " " + b + " " + c);
		
	}
}
