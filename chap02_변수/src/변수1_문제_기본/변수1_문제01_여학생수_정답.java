package 변수1_문제_기본;

public class 변수1_문제01_여학생수_정답 {

	public static void main(String[] args) {
		/* 
			[문제]	  	
				철수네 반 학생은 총 31명이다. 
				남학생이 17명이면 여학생은 몇 명인지 구하시오.			
			[정답] 
				14
		*/	
	
		/*
			[풀이]
				남학생 + 여학생 = 31명
				17 	   + n      = 31
				n = 31 - 17
		*/
		
		int a = 31;
		int b = 17;
		int result = a - b;
		
		System.out.println(result);

	}

}
