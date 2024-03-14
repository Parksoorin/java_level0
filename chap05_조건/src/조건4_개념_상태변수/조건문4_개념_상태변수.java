package 조건4_개념_상태변수;

import java.util.Random;

public class 조건문4_개념_상태변수 {

	public static void main(String[] args) {
		/*
			[문제]
				랜덤숫자(1~10) 두개를 각각 a와 b 에저장한다. 
				새로운랜덤숫자(1~2)을 c에 저장한다.
				c의 값이 1이면 a 에서 b를 뺀값을 출력한다.
				c의 값이 2이면 b 에서 a를 뺀값을 출력한다.
				
				여기에서 변수c와 같이 변수c의 값의상태에 따라 결과가 달라질때,
				변수c를 보통 상태변수라고한다.
				상태변수는 보통 식에서 == (같다) 만 사용한다. 
			[예시]
				a = 10
				b = 4
				c = 2
				-6
		*/
	
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		Random ran = new Random();
		a = ran.nextInt(10) + 1;
		b = ran.nextInt(10) + 1;
		c = ran.nextInt(2) + 1;
		
		if(c == 1) {
			d = a - b;
		}
		if(c == 2) {
			d = b - a;
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println(d);
		
	}

}
