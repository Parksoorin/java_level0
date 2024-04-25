package 이차반복문5_문제_조인;

import java.util.Arrays;

public class 이차반복문5_문제03_중복값두개_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            a배열과 b배열 전체를 비교하여 
	            a배열 안에도 있고 b배열 안에도 있는 값은 
	            c배열에 저장하시오. 
	            단, b배열에 같은 값이 두 개 있는 값만 추가하시오.
	        [정답]
	            [7, 3, 0, 0, 0, 0, 0, 0, 0, 0]
	    */

	    int[] a = {1, 2, 7, 40, 3, 6};
	    int[] b = {1, 2, 7, 3, 7, 6, 2, 2, 3};
	    int[] c = new int[10];

	    int index = 0;
	    for(int i = 0; i < a.length; i++) {
	    	int cnt = 0;
	    	for(int j = 0; j < b.length; j++) {
	    		if(a[i] == b[j]) {
	    			cnt++;
	    		} else {
	    			continue;
	    		}
	    	}
	    	if(cnt == 2) {
	    		c[index] = a[i];
	    		index++;
	    	}
	    }
		System.out.println(Arrays.toString(c));
	  
	}
}
