package 비교1_문제_기본;

public class 비교1_문제05_오이_정답 {

	public static void main(String[] args) {
		/*
		[문제] 
			현금 20000원을 가지고 
			마트에 가서 오이를 9개 구매했더니,
			거스름돈이 2000원이다.
			오이 한 개의 가격이 얼마인지 구하시오.

	*/

		int a = 20000;
		int b = 9;
		int c = 2000;
	
	
		int d = (a - c) / b; 
		boolean e = (a - d * b == c);
	}

}
