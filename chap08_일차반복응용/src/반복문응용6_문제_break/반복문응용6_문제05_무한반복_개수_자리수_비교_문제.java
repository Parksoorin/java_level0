package 반복문응용6_문제_break;

public class 반복문응용6_문제05_무한반복_개수_자리수_비교_문제 {
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
		
		int a = 500;
		int cnt = 0;
		
		while(true) {
			int a1 = a % 10;
			if(a % 8 == 0 && a1 == 6) {
				System.out.println(a);
				cnt++;
				if(cnt == 4) {
					break;
				}
			}
			a++;
		}
	}
}
