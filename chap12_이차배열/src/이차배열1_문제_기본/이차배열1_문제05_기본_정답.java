package 이차배열1_문제_기본;

import java.util.Arrays;
import java.util.Random;

public class 이차배열1_문제05_기본_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            arr배열을 한 줄당 3개씩 3줄 총 9개로 이차원으로 만들고, 
	            랜덤값(1~100)을 9개 저장하시오.
	            arr배열의 값 중에서 50이상인 수의 개수를 출력하시오.
	        [예시]
	            [63, 69, 17]
				[73, 69, 38]
				[55, 57, 14]
				6

    */
		Random ran = new Random();
		int[][] darr = new int[3][3];
	    for(int i=0; i<darr.length; i++) {
	        for(int j=0; j<darr[i].length; j++) {
	        	int a = ran.nextInt(100) + 1 ;
	        	darr[i][j] = a;
	        }
	    }
	    
	    for(int i = 0; i < darr.length; i++) {
	    	System.out.println(Arrays.toString(darr[i]));
	    }
	    
	    int count = 0;
	    for(int i=0; i<darr.length; i++) {
	        for(int j=0; j<darr[i].length; j++) {
	        	if(darr[i][j] >= 50) {
	        		count +=1;
	        	}
	        }
	    }
	    System.out.println(count);
	}

}
