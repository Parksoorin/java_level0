package 이차반복문2_개념_규칙찾기;

import java.util.Random;

public class 이차반복문2_개념02_반복규칙찾기2 {

	public static void main(String[] args) {
		/*
	        [문제]
	            랜덤(3~6)숫자 하나를 저장하고 그 숫자만큼 아래와 같은 규칙 출력하시오.
	            단, 일차 반복문과 이차 반복문으로 출력하시오.
	        [예시1]
	            r = 6
	            
	            1 7 13
	            2 8 14
	            3 9 15
	            4 10 16
	            5 11 17
	            6 12 18
	            
	        [예시2]
	            r = 3
	
	            1 4 7      
	            2 5 8      
	            3 6 9	   
	    */
		Random ran = new Random();
		int r = ran.nextInt(4) + 3;
		System.out.println(r);
	
	    // 일차원 반복문
	    for(int i = 0; i < r; i++) {
	
	        int plus = i + 1;
	        int x = r * 0 + plus;
	        int y = r * 1 + plus;
	        int z = r * 2 + plus;
	        System.out.println(x + " " + y + " " + z);
	    }
	
	    System.out.println("---------------------");
	    int a = 3;
	    for(int i=0; i < r; i++) {
	
	        int plus = i + 1;
	
	        for(int j = 0; j < 3; j++) {
	        	System.out.print(plus + " ");
	            
	            plus += r;
	        }
	        System.out.println();
	    }

	}

}
