package 이차반복문2_개념_규칙찾기;

import java.util.Random;

public class 이차반복문2_개념03_반복규칙찾기3_ {

	public static void main(String[] args) {
		/*
	        [문제]
	            랜덤(3~6)숫자 하나를 저장하고 그 숫자만큼 아래와 같이 출력하시오.
	            단, 아래 일차 반복문과 이차 반복문으로 출력하시오.
	        [예시1]
	            r = 6
	            
	            1 2 3
	            2 3 4
	            3 4 5
	            4 5 6
	            5 6 7
	            6 7 8
	        [예시2]
	            r = 4
	
	            1 2 3
	            2 3 4	   
	            3 4 5
	            6 7 8
	    */
		Random ran = new Random();
		int r = ran.nextInt(4) + 3;
		System.out.println(r);
	
	    // 일차원 반복문
	    for(int i= 0; i< r ; i++) {
	        int x = i + 1;
	        int y = i + 2;
	        int z = i + 3;
	        System.out.println(x + " " + y + " " + z);
	    }
	    System.out.println("------------------");
	    
	    // 이차원 반복문
	    for(int i=0; i < r ; i++) {
	
	        int plus = i + 1;
	
	        for(int j = 0; j < 3; j++) {
	        	System.out.print(plus + j + " ");
	        }
	        System.out.println();
	    }


	}

}
