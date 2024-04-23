package 이차반복문2_문제_규칙찾기;

import java.util.Random;

public class 이차반복문2_문제01_규칙찾기1_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            3~6 사이의 랜덤 숫자 하나를 저장하고 
	            그 숫자만큼 아래와 같은 규칙으로 출력하시오.
	            단, 일차 반복문과 이차 반복문으로 출력하시오.
	        [예시]
	            r = 6
	            1 1 1
	            2 2 2
	            3 3 3
	            4 4 4
	            5 5 5
	            6 6 6    
	    */
		Random ran = new Random();
		int r = ran.nextInt(4) + 3;
		System.out.println(r);
	
	    // 일차 반복문
	    for(int i=0; i < r; i++) {
	        int num = i + 1;
	        System.out.println(num + " " + num +  " " + num);
	    }
	    System.out.println("------------------------");
	    // 이차 반복문
	    for(int i=0; i < r; i++) {
	
	        int num = i + 1;
	
	        for(int j = 0; j < 3; j++) {
	        	System.out.print(num + " ");
	
	        }
	        System.out.println();
	    }

	}

}
