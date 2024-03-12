package 변수2_문제_곱하기나누기;

public class 변수2_문제07_편의점_정답 {

	public static void main(String[] args) {
		/* 
			[문제]	  	
				철수는 현금 10000원을 가지고 있다. 
				편의점에가서 과자를 구입하려고 한다. 		  	
				가격이 1200원인 과자 3개와 
				가격이 1900원인 음료수 1개를 구입하였다.
				거스름돈을 구하시오.
			[정답] 
				4500
		*/
	
		/*
			[풀이]
				거스름돈 
				= 현금 - 구입한상품가격
				= 10000 - (1200 * 3 + 1900 * 1)
		*/
		double a = 10000;
		double b1 = 1200;
		double b2 = 1900;
	
		double c1 = 3;
		double c2 = 1;
	
		double d1 = b1 * c1;
		double d2 = b2 * c2;
	
		double result = a - (d1 + d2);


	}

}
