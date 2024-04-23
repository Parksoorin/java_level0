package 이차반복문1_개념_기본;

import java.util.Random;

public class 이차반복문1_개념02_사각형 {

	public static void main(String[] args) {
		 /*
	        [개념] 사각형그리기
	            랜덤으로 세로(3~6)을 저장하고, 
	            각 길이에 맞게 사각형을 그려보시오. 
	            단, 가로는 항상 5이다.
	            일차원 반복문과 이차원 반복문으로 그려보시오.
	        [예시] 
	            sero = 3
	            #####
	            #####
	            #####    
	    */
		Random ran = new Random();
		int sero = ran.nextInt(4) + 3;
		
	    int garo = 5;
	
	    // 일차원 반복문
	    for(int i = 0; i < sero * garo; i++) {
	    	System.out.print("#");
	        if(i % 5 == 4) {
	        	System.out.println();
	        }
	    }
	    System.out.println("-----------------");
	    
	
	    // 이차원 반복문
	    for(int i = 0; i < sero; i++) {
	        for(int j = 0; j < garo; j++) {
	        	System.out.print("#");
	        }
	        System.out.println();
	    }

	}

}
