package 조건2_개념_배수약수자리수;

import java.util.Random;

public class 조건문2_개념02_약수 {

	public static void main(String[] args) {
		
	    /*
	      [문제]
	        변수에 1부터 10 사이의 숫자를 랜덤으로 저장한다.
	        저장한 숫자의 값이 300의 약수이면 "o"
	        300의 약수가 아니면 "x"를 출력하시오.
	    */
		
		int a = 0;
		
		Random ran = new Random();
		a = ran.nextInt(10) + 1;
		System.out.println(a);
		
		if(300 % a == 0) {
			System.out.println("o");
		}
		if(300 % a != 0) {
			System.out.println("x");
		}
		
	}

}
