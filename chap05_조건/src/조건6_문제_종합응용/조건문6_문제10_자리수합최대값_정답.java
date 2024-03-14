package 조건6_문제_종합응용;

import java.util.Random;

public class 조건문6_문제10_자리수합최대값_정답 {

	public static void main(String[] args) {
	    /*
	        [문제]
	            [1] 랜덤(10~99)숫자 3개를 저장한다.
	            [2] 각각의 숫자의 자리수의 합을 구한다.
	            [3] 자리수의 합이 가장큰수를 출력한다.
	            
	        [예시]
	            11 18 32 
	        [설명] 
	            1 , 1 의합은 2  
	            1 , 8 의합은 9 
	            3 , 2 안합은 5 
	            세값중에서 9가 가장크다. 여기서 9를 출력하면안되고 18을 출력한다.
	        
	            [정답]
	            18
	    */
		
		int a = 0;
		int b = 0;
		int c = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int max = 0;
		int maxNum = 0;
		
		Random ran = new Random();
		a = ran.nextInt(90) + 10;
		b = ran.nextInt(90) + 10;
		c = ran.nextInt(90) + 10;
		
		a1 = a / 10;
		a2 = a % 10;
		
		b1 = b / 10;
		b2 = b % 10;
		
		c1 = c / 10;
		c2 = c % 10;
		
		a3 = a1 + a2;
		b3 = b1 + b2;
		c3 = c1 + c2;

		max = a3;
		maxNum = a;		// 여기가 키포인트이다.
		
		if(max < b3) {
			max = b3;
			maxNum = b;
		}
		if(max < c3) {
			max = c3;
			maxNum = c;
		}
		
		System.out.println(a + " " + b + " " + c + " " + maxNum);
		
	}

}
