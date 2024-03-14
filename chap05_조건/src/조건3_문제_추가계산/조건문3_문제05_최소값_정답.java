package 조건3_문제_추가계산;

import java.util.Random;

public class 조건문3_문제05_최소값_정답 {

	public static void main(String[] args) {
	   	/*
		    [최소값]
		        [1] 숫자 3개를 랜덤으로 저장한다. (1~1000 사이의 숫자)
		        [2] 3개의 랜덤 숫자를 비교한다.
		        [3] 가장 작은수(MIN)를 출력한다.      
		*/

		int a = 0;
		int b = 0;
		int c = 0;
		
		Random ran = new Random();
		a = ran.nextInt(1000) + 1;
		b = ran.nextInt(1000) + 1;
		c = ran.nextInt(1000) + 1;
		System.out.println(a + ", " + b + ", " + c);
		
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		System.out.println(min);
		
	}

}
