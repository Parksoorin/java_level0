package 변수5_문제_자리수;

public class 변수5_문제03_거스름돈_정답 {

	public static void main(String[] args) {
		/*
			[문제]  
				거스름돈 8900원을 거슬러주려고 한다.
				화폐 단위별로 몇 장씩 나눠줘야 하는지 구하시오.
			[정답]
				오천원 : 1 
				일천원 : 3 
				오백원 : 1 
				일백원 : 4
		*/
		/*
			이해를 돕기위해 한글 변수를 사용하였다.
		*/
	
		int 총금액 = 8900;
	
		int 오천원 = (총금액 % 10000 / 5000);
		int 일천원 = (총금액 % 5000 / 1000);
		int 오백원 = (총금액 % 1000 / 500);
		int 일백원 = (총금액 % 500 / 100);
	
	
		System.out.println("오천원 : " + 오천원 );
		System.out.println("일천원 : " + 일천원 );
		System.out.println("오백원 : " + 오백원 );
		System.out.println("일백원 : " + 일백원 );
	}

}
