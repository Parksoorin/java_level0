package 반복문응용6_문제_break;

public class 반복문응용6_문제03_무한반복_개수_빼기_문제 {
	public static void main(String[] args) {
		
	    /*
			[문제] 
				다음 조건이 전부 맞는 수를 출력하시오.
				[조건1] 13의 배수를 전부 검사한다.
				[조건2] 그 중 6번째 배수에서 4번째 배수를 뺀 수를 구한다.
				단, break를 사용하시오.
			[정답]
				26
		*/
		
		int cnt = 0;
		int a = 13;
		int a6 = 0;
		int a4 = 0;
		
		while(true) {
			if(a % 13 == 0) {
				cnt++;
				if(cnt == 4) {
					a4 = a;
				}
				if(cnt == 6) {
					a6 = a;
					break;
				}
			}
			a++;
		}
		System.out.println(a6 - a4);
	}
}
