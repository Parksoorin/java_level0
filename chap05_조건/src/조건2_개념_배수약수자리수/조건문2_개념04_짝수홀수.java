package 조건2_개념_배수약수자리수;

import java.util.Random;

public class 조건문2_개념04_짝수홀수 {

	public static void main(String[] args) {

	    /*
	        [문제]
	            a 변수에 1부터 10 사이의 랜덤 숫자를 저장하고, 
	            "짝수" 또는 "홀수"를 출력하시오.
	    */
		
		int a = 0;
		
		Random ran = new Random();
		a = ran.nextInt(10) + 1;
		System.out.println(a);
		
		if(a % 2 == 0) {
			System.out.println("짝수");
		}
		if(a % 2 == 1) {
			System.out.println("홀수");
		}
		
	}

}
