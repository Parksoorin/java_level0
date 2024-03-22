package 반복문응용6_문제_break;

public class 반복문응용6_문제05_무한반복_개수_자리수_비교_정답 {
	public static void main(String[] args) {
		
		/*
		   	[문제] 
	            500보다 큰 8의 배수를 순서대로 4개만 출력하시오.
				단, 일의 자리수가 6이다.
				단, break를 사용하시오.
	        [정답]
	            536
				576
				616
				656
		*/
		
		int count = 0;
		int i = 1;
		
		while(true ){
			int a = i % 10;
			if(i > 500 && i % 8 == 0 && a == 6) {

				System.out.println(i);
				count += 1;

				if(count == 4) {
					break;
				}
			}
			i += 1;
			
		}
		
	}
}
