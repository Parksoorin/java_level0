package 조건1_개념_기본;

/*
	# 조건문 if
		1. if 		: 키워드
		2. (조건식) 	: 조건이 사실인지 판별한다.
		3. {기능}	: 위 조건을 기반으로 기능을 실행한다.
		-----------------------------------------
		4. 구조
			if(조건식) {
				조건식이 참(true)일 때 실행할 문장;
			}
*/

public class 조건문1_개념01_조건문 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		if(a == b) {
			System.out.println("실행 O");
		}
		if(a != b) {
			System.out.println("실행 X");		// 이 부분은 실행이 안된다.
		}
		
		// 예) 홀짝
		int num = 8;
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		}
		if(num % 2 != 0) {
			System.out.println("홀수");		// 이 부분은 실행이 안된다.
		}
		
		
	}
}
