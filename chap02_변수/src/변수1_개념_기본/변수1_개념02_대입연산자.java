package 변수1_개념_기본;

/*
	# 대입 연산자 =
		- 변수는 오직 대입 연산자를 통해서만이 값의 변경이 가능하다.
*/

public class 변수1_개념02_대입연산자 {
	public static void main(String[] args) {
		
		int x = 8;
		
		// 문제) x에 1을 더해보자.
		System.out.println(x + 1);		// 9
		
		// 위 식을 통해 값 1이 추가된 것처럼 보이지만
		// 실제 x의 값은 8로 변함이 없다.
		System.out.println(x);			// 8
		
		int y = 8;
		// 대입 연산자를 통해서만 값이 변경된다.
		// 연산자 우선순위가 대입연산자 보다 더하기 연산자가 우선 적용된다.
		y = y + 1;
		System.out.println(y);	    	// 9
		
	}
}