package 변수5_문제_자리수;

public class 변수5_문제04_잔돈부족_정답 {

	public static void main(String[] args) {
		/*
			[문제]  
				거스름돈 174900원을 거슬러주려고 한다.
				단, 일천원 짜리는 매진되어 오백원짜리로 거슬러준다면,
				단위별로 몇 장씩 나눠줘야 하는지 구하시오.
			[정답]
				오만원 : 3 
				일만원 : 2 
				오천원 : 0
				일천원 : 0
				오백원 : 9
				일백원 : 4
		*/
		
		/*
			이해를 돕기위해 한글 변수를 사용하였다.
		*/

		int 총금액 = 174900;
	
		int 오만원 = (총금액 / 50000);
		int 일만원 = (총금액 % 50000 / 10000);
		int 오천원 = (총금액 % 10000 / 5000);
		int 일천원 = 0;
		int 오백원 = (총금액 % 5000 / 500); // 여기가 키포인트
		int 일백원 = (총금액 % 500 / 100);
		
		System.out.println("오만원 : " + 오만원 );
		System.out.println("일만원 : " + 일만원 );
		System.out.println("오천원 : " + 오천원 );
		System.out.println("일천원 : " + 일천원 );
		System.out.println("오백원 : " + 오백원 );
		System.out.println("일백원 : " + 일백원 );
	}

}
