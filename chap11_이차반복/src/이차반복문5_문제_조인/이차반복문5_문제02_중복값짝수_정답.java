package 이차반복문5_문제_조인;

import java.util.Arrays;

public class 이차반복문5_문제02_중복값짝수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            a배열과 b배열 전체를 비교하여 
	            a배열 안에도 있고 b배열 안에도 있는 값은 
	            c배열에 저장하시오. 
	            단, 짝수만 저장하시오.
	        [정답]
	            [2, 6, 0, 0, 0, 0]   
	    */

	    int[] a = {1, 2, 7, 40, 3, 6};
	    int[] b = {1, 6, 2,  9, 3, 7};
	    int[] c = new int[6];

	    int index = 0;
	    for(int i=0; i<a.length; i++) {
	        for(int j=0; j<b.length; j++) {
	            if(a[i] == b[j] && a[i] % 2 == 0) {
	            	c[index] = a[i];
	            	index += 1;
	            }
	        }
	    }

	    System.out.println(Arrays.toString(c));
		
	}
}
