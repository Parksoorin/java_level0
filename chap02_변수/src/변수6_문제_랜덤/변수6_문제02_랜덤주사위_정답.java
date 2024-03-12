package 변수6_문제_랜덤;

import java.util.Random;

public class 변수6_문제02_랜덤주사위_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            철수는 주사위게임을 하고있다. 
	            주사위는 두개를 사용한다.
	            주사위한개는 특이하게 -3 ~ 2 의 숫자가 적혀있고,
	            다른 한주사위는 1~6사이의 숫자가 적혀있다.
	
	            주사위 두개를 던저서 주사위의 숫자와 그합을 출력하시오. 
	        
	        [예시]
	            -3 
	            1 
	            -2
	    */  
		
		Random ran = new Random();
		int a = ran.nextInt(6) - 3;
		int b = ran.nextInt(6) + 1;
		
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
