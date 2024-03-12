package 변수2_문제_곱하기나누기;

public class 변수2_문제04_마트_정답 {

	public static void main(String[] args) {
		/*
			[문제]	  	
				철수는 현금 10000원을 가지고 마트에 갔다.
				사과 한 개의 가격은 200원이고, 귤 한 개의 가격은 110원이다. 
				사과 3개와 귤 10개를 사려고 한다.  
				모두 사면 거스름돈은 얼마인지 구하시오.
			[정답]
				8300
		*/  
	
		/*
			[풀이]
				거스름돈
				= 현금 - 구입한 상품가격
				= 10000 - (200 * 3 + 110 * 10)
		*/
		
		double a = 10000;
		double b = 200;
		double c = 110;
		double d = 3;
		double f = 10;
		
		double g = b * d;
		double h = c * f;
		double result = a - (g + h);
		System.out.println(String.format("%.0f", result));
		
		
		
	}

}
