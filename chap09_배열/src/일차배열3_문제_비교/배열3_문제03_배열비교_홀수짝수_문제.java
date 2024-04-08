package 일차배열3_문제_비교;

import java.util.Arrays;

public class 배열3_문제03_배열비교_홀수짝수_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            a 와 b 의 각각의 값의 합이 짝수이면 arr에 2를 저장한다 
	            a 와 b 의 각각의 값의 합이 홀수이면 arr에 1를 저장한다.
	        [정답]
	            2,1,1,2,1
	    */
	
	    int[] a = {10, 43, 23, 12, 53};
	    int[] b = {54,  6,  4, 12, 50};
	    
	    int[] arr = {0, 0, 0, 0, 0};
	
	    for(int i = 0; i < a.length; i++) {
	    	int sum = a[i] + b[i];
	    	if(sum % 2 == 0) {
	    		arr[i] = 2;
	    	} else {
	    		arr[i] = 1;
	    	}
	    }
	    
	    System.out.println(Arrays.toString(arr));

	}

}
