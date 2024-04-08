package 반복문응용6_문제_break;

public class 반복문응용6_문제02_무한반복_자리수_개수_문제 {
	public static void main(String[] args) {
		
		/*
			[문제]
				9의 배수 중에서  10의 자리가 6인 첫번째 배수를 출력하시오.
				단, break를 사용하시오.
			[정답]
				63
		*/
		
		int a = 60;
		while(true) {
			if(a % 9 == 0) {
				break;
			}
			a++;
		}
		System.out.println(a);
	}
}
