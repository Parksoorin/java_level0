package 변수2_문제_곱하기나누기;

public class 변수2_문제01_자전거왕복_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  	
				사과 4개는 32g이고,	귤 3개는 12g이다. 		
				사과 1개의 무게와 귤 1개의 무게의 차이는 얼마인지 구하시오. 
				단, 같은 종류의 과일의 무게는 동일하다. 
				단, 소수점 1자리 까지 구하시오.
			[정답] 
				4.0
		*/  
	
		/*
			[풀이]
				사과1개 = 32 / 4
				귤1개 = 12 / 3
	
				차이
				= 사과1개 - 귤1개
		*/
		
		double a = 32;
		double b = a / 4;
		double c = 12;
		double d = c / 3;
		
		double result = b-d;
		System.out.println(String.format("%.1f", result));

	}

}
