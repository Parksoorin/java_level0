package 이차배열1_개념_기본;

import java.util.Arrays;

public class 이차배열1_개념02_이차원배열 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            arr배열에 1~9를 순차적으로 저장하고 출력하시오.
	        [정답]
	            arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]    
	    */

		int[][] darr = new int[3][3];
		int num = 1;
	    for(int i=0; i<darr.length; i++) {
	        for(int j=0; j<darr[i].length; j++) {
	        	darr[i][j] = num;
	            num += 1;
	        }
	    }
	    
	    for(int i = 0; i < darr.length; i++) {
	    	System.out.println(Arrays.toString(darr[i]));
	    }
	}

}
