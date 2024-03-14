package 조건4_문제_상태변수;

import java.util.Random;

public class 조건문4_문제03_큰수작은수_정답 {

	public static void main(String[] args) {
	    /*
	        [문제]
	            1부터 10 사이의 랜덤 숫자중 두 개를 출력한다.
	            하나는 반드시 1~5 사이의 숫자이어야 하고,
	            나머지 하나는 반드시 6~10 사이의 숫자이어야 한다.
	            단, 출력순서도 랜덤으로 출력되어야 한다. 
	        
	        [예시1]
	            3 6
	
	        [예시2]
	            8 1
	    */
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		Random ran = new Random();
		a = ran.nextInt(5) + 1;
		b = ran.nextInt(5) + 6;
		c = ran.nextInt(2) + 1;
		
		if(c == 1) {
			System.out.println(a + " " + b);
		}
		if(c == 2) {
			System.out.println(b + " " + a);
		}
		
	}

}
