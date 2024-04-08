package 일차배열3_개념_비교;

import java.util.Arrays;

public class 배열3_개념02_배열비교_합 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            a 와 b 의 각각 값의 합을 total에 저장하시오.
	        [정답]
	            [64, 49, 27, 24, 103]    
	    */
	
	    int[] a = {10, 43, 23, 12, 53};
	    int[] b = {54,  6,  4, 12, 50};
	    
	    int[] total = {0, 0, 0, 0, 0};
	
	    for(int i=0; i<5; i++) {
	        int sum = a[i] + b[i];
	        total[i] = sum;
	    }
	    System.out.println(Arrays.toString(total));

	}

}
