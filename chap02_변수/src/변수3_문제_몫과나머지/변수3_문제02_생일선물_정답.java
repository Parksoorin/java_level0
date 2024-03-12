package 변수3_문제_몫과나머지;

public class 변수3_문제02_생일선물_정답 {
	public static void main(String[] args) {
		  /*
			[문제]
				철수는 친구의 생일 선물로 가격이 4000원인 필통 1개와 
				가격이 700원인 공책 몇 권을 사려고 한다. 
				철수는 13000원을 가지고 있을 때,
				[문제1] 공책은 최대한 몇 권을 살 수 있을지 구하시오.
				[문제2] 공책을 최대로 구입한 후 나머지 금액도 출력하시오.
			[정답] 
				[1] 12
				[2] 600
		 	*/

			int a = 13000;
			int b = 4000;
			int c = a - b;
			int d = 700;

			int result1 = (c / d);
			int result2 = c % d;
	}
}
