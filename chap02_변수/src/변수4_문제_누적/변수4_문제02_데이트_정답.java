package 변수4_문제_누적;

public class 변수4_문제02_데이트_정답 {

	public static void main(String[] args) {
		  /*
				[문제] 
					철수와 영희는 50000원을 가지고 있다. 
					철수와 영희는 같이 영화 1편을 관람했다.
					간식은 팝콘 1개와 콜라 2개를 사먹었다.
					아래 힌트를 참고하여 남은 돈은 얼마인지 구하시오. 
					[힌트] 
						(1) 콜라 1개는 팝콘 1개보다 4000원 싸다.
						(2) 영화 1편의 가격은 12000원이다.
						(3) 팝콘의 가격은 영화의 6/10 가격이다.  
				[정답]
					12400
		 	*/
		double a = 50000;
		double b = 12000;
		double c = b * 0.6;
		double d = c - 4000;

		double total = 0;

		// 누적의 의미
		total = total + b * 2;
		
		System.out.println(total);
		total = total + c * 1;
		System.out.println(total);
		total = total + d * 2;
		
		System.out.println(total);
		total = a - total; 
		System.out.println(total);

	}

}
