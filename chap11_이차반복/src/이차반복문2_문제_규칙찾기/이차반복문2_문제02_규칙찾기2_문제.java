package 이차반복문2_문제_규칙찾기;

import java.util.Random;

public class 이차반복문2_문제02_규칙찾기2_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            3~6 사이의 랜덤 숫자 하나를 저장하고 
	            그 숫자만큼 아래와 같은 규칙으로 출력하시오.
	            단, 일차 반복문과 이차 반복문으로 출력하시오.
	        [예시]
	            r = 6
	            3 2 1
	            6 5 4
	            9 8 7
	            12 11 10
	            15 14 13
	            18 17 16   
	    */
		
		Random ran = new Random();
		int r = ran.nextInt(4) + 3;
		int num = 3;
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print((num - j) + " ");
			}
			System.out.println();
			num += 3;
		}
		

	}

}
