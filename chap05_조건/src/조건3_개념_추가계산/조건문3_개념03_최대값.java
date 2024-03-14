package 조건3_개념_추가계산;

import java.util.Random;

public class 조건문3_개념03_최대값 {

	public static void main(String[] args) {
	    /*
	        [최대값]
	            [1] 숫자 3개를 랜덤으로 저장한다. (1~1000 사이의 숫자)
	            [2] 3개의 랜덤 숫자를 비교한다.
	            [3] 가장 큰 수(MAX)를 출력한다.    
	    */
		
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		Random ran = new Random();
		a = ran.nextInt(1000) + 1;
		b = ran.nextInt(1000) + 1;
		c = ran.nextInt(1000) + 1;
		System.out.println(a + ", " + b + ", " + c);
		
		if(a > b && a > c) {
			max = a;
		}
		if(b > a && b > c) {
			max = b;
		}
		if(c > a && c > b) {
			max = c;
		}
		System.out.println("max = " + max);
		System.out.println("-----");

		max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		System.out.println("max = " + max);
	}

}
