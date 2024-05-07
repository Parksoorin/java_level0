package 함수1_문제_기본;

import java.util.Random;

public class 함수1_문제04_연산자게임_정답 {
	/*
		[문제]
			랜덤숫자(1~10) 두개를 각각 a와 b 에 저장한다. 
			새로운랜덤숫자(1~3)을 c에 저장한다.
			c의 값이 1이면 a 와 b의 합을 출력한다.
			c의 값이 2이면 a 에서 b를 뺀값을 출력한다.
			c의 값이 3이면 a 와 b의 곱을 출력한다. 

			
		[예시]
			a = 10
			b = 4
			c = 2
			답 : 6
	*/
	public static void solution(int a , int b , int c) {
		int result = a;
		if(c == 1){
			result = a + b;
		}
		if(c == 2){
			result = a - b;
		}
		if(c == 3){
			result = a * b;
		}
        System.out.println("결과:"+result);

	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int number = ran.nextInt(10) + 1;
		int number2 = ran.nextInt(10) + 1;
		int op = ran.nextInt(3) + 1;
		System.out.println(number + " " + number2 + " " + op);
		solution(number, number2, op);
	}

}
