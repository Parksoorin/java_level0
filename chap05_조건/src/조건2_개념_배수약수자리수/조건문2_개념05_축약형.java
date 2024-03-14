package 조건2_개념_배수약수자리수;

import java.util.Random;

public class 조건문2_개념05_축약형 {

	public static void main(String[] args) {
	    /*
	        [문제]
	            랜덤(0~9)를 a에 저장한다. 
	            a의 값이 4의 배수이면 "o"
	            4의 배수가 아니면 "x" 출력하시오.
	        
	    */
		
		int a = 0;
		boolean b = false;
		
		Random ran = new Random();
		a = ran.nextInt(10);
		System.out.println(a);
		
		// 식을 변수에 저장하면 true나 false가 된다.
		b = a % 4 == 0;
		
		if(b == true) {
			System.out.println("o");
		}
		if(b == false) {
			System.out.println("x");
		}

		 /*
	        b == true 는 줄여서 b, 
	        b == false 는 줄여서 !b 와 같이 표현가능하다.
	    */
		if(b) {
			System.out.println("o (축약형)");
		}
		if(!b) {
			System.out.println("x (축약형)");
		}
		
	}

}
