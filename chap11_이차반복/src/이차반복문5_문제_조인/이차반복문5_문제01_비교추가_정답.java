package 이차반복문5_문제_조인;

import java.util.Arrays;

public class 이차반복문5_문제01_비교추가_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            a배열과 b배열 전체를 비교하여 
	            a배열 안에도 있고 b배열 안에도 있는 값은 
	            c배열에 저장하시오.
	        [정답]
	            c = [10, 20, 0, 0]    
	    */

	    int[] a = {10, 20, 30, 40};
	    int[] b = {10,  5, 20,  9};
	    int[] c = new int[4];

	    for(int i=0; i<a.length; i++) {
	        for(int j=0; j<b.length; j++) {
	            if(a[i] == b[j]) {
	            	c[i] = a[i];
	            }
	        }
	    }

	    System.out.println("c = " + Arrays.toString(c));

	}
}
