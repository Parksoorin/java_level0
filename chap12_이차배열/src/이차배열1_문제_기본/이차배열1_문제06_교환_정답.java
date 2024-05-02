package 이차배열1_문제_기본;

import java.util.Arrays;
import java.util.Random;

public class 이차배열1_문제06_교환_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            [1] arr배열에 랜덤 값(1~100)을 9개 저장 후 출력하시오.
	            [2] 랜덤으로 값 두 개를 선택 후 두 개의 위치를 교환 후 출력하시오.
	        [예시]
	            값 교체 전 >>>
	            [46, 62, 75]
	            [36, 18, 100]
	            [26, 11, 39]
	
	            r1 = 11
	            r2 = 36
	            
	            값 교체 후 >>>
	            [46, 62, 75]
	            [11, 18, 100]
	            [26, 36, 39]    

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
	    System.out.println("------");
	    
	    int r1 = ran.nextInt(3);
	    int r2 = ran.nextInt(3);
	    int r3 = ran.nextInt(3);
	    int r4 = ran.nextInt(3);
	    
	    int temp = darr[r1][r2];
	    darr[r1][r2] = darr[r3][r4];
	    darr[r3][r4] = temp;
	    
	    
	    for(int i = 0; i < darr.length; i++) {
	    	System.out.println(Arrays.toString(darr[i]));
	    }
	}

}
