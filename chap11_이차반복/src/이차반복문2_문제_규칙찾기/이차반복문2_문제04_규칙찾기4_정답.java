package 이차반복문2_문제_규칙찾기;

import java.util.Random;

public class 이차반복문2_문제04_규칙찾기4_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            3~6 사이의 랜덤 숫자 하나를 저장하고 
	            그 숫자만큼 아래와 같은 규칙으로 출력하시오.
	            단, 일차 반복문 과 이차 반복문으로 출력하시오.
	            
	        [예시]
	            r = 6
	        [출력]
	            18 12 6
	            17 11 5
	            16 10 4
	            15 9 3
	            14 8 2
	            13 7 1    
	        
	        [예시]
	            r = 4
	        [출력]
	            12 8 4
	            11 7 3
	            10 6 2
	            9 5 1
	    */
		Random ran = new Random();
		int r = ran.nextInt(4) + 3;
		System.out.println(r);
	    int x = r * 3;
	    int y = r * 2;
	    int z = r * 1;
	
	    for(int i=0; i < r; i++) {
	    	System.out.println(x + " " + y + " " + z);
	        x -= 1;
	        y -= 1;
	        z -= 1;
	    }
	    System.out.println("--------------------------");
	    
	    int a = r * 3;
	    for(int i = 0; i < r; i++) {
	        int b = a;
	        for(int j = 0; j < 3; j++){
	        	System.out.print(b + " ");
	            b -= r;
	        }
	        a -= 1;
	        System.out.println();
	    }

	}

}
