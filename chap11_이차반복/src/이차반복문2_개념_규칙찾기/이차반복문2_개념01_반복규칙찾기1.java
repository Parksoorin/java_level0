package 이차반복문2_개념_규칙찾기;

import java.util.Random;

public class 이차반복문2_개념01_반복규칙찾기1 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            랜덤(3~6)숫자 하나를 저장하고 그 숫자만큼 아래와 같은 규칙 출력하시오.
	            단, 일차 반복문과 이차 반복문으로 출력하시오.
	            
	        [예시1]
	            r = 6
	
	            1 2 3
	            4 5 6
	            7 8 9
	            10 11 12
	            13 14 15
	            16 17 18
	
	        [예시2]
	            r = 3
	            
	            1 2 3
	            4 5 6
	            7 8 9	    
	    */
		Random ran = new Random();
		int r = ran.nextInt(4) + 1;
		System.out.println(r);
	
	    // 일차원 반복문
	    int num = 1;
	    for(int i=0; i < r * 3; i++) {
	        System.out.print(num + " ");
	
	        if(i % 3 == 2) {
	        	System.out.println();
	        }
	        num += 1;
	    }
	    System.out.println("-------------------");
	
	    // 이차원 반복문
	    num = 1;
	    for(int i=0; i < r; i++) {
	        for(int j = 0; j < 3; j++) {
	            System.out.print(num + j + " ");
	        }
	        num += 3;
	        System.out.println();
	    }
	}

}
