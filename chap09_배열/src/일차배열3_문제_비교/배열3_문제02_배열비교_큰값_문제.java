package 일차배열3_문제_비교;

import java.util.Arrays;

public class 배열3_문제02_배열비교_큰값_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	             a 와 b 의 각각의 값을 비교해서 더크거나 같은값을 big 저장하시오.
	        [정답]
	            [54,43,23,12,53]    
	    */
	
	    int[] a = {10, 43, 23, 12, 53};
	    int[] b = {54,  6,  4, 12, 50};
	    
	    int[] big = {0, 0, 0, 0, 0};
	
	    for(int i = 0; i < a.length; i++) {
	    	if(a[i] > b[i]) {
	    		big[i] = a[i];
	    	} else {
	    		big[i] = b[i];
	    	}
	    }

	    System.out.println(Arrays.toString(big));
	    
	}

}
