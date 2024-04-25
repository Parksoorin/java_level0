package 이차반복문2_문제_규칙찾기;

import java.util.Random;

public class 이차반복문2_문제06_규칙찾기6_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            3~6 사이의 랜덤 숫자 하나를 저장하고 
	            그 숫자만큼 아래와 같은 규칙으로 출력하시오.
	            단, 일차 반복문과 이차 반복문으로 출력하시오.
	        [예시]
	            r = 6
	
	            6 5 4
	            5 4 3
	            4 3 2
	            3 2 1   
	    */
		
		Random ran = new Random();
		int r = ran.nextInt(4) + 3;
		System.out.println("r = " + r);
		
		int num = r;
		
		for(int i = 0; i < r - 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println();
			num += 2;
		}
		
//		for(int i=0; i < r - 2; i++) {
//	        int num = r - i;
//	        for(int j = 0; j < 3; j++) {
//	        	System.out.print(num - j + " ");
//	        }
//	        System.out.println();
//	    }
		

	}

}
