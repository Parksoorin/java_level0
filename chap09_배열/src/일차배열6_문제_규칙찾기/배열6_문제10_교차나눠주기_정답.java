package 일차배열6_문제_규칙찾기;

import java.util.Arrays;

public class 배열6_문제10_교차나눠주기_정답 {

	public static void main(String[] args) {
		/*
	        [문제] 
	            c배열의 값을 a배열에 한번, b배열에 한번 
	            교차로 추가하시오.
	        [정답]
	            a = [10,30,50]
	            b = [20,40,60]   
	    */
	
	    int[] c = {10,20,30,40,50,60};
	    
	    int[] a = new int[c.length/2];
	    int[] b = new int[c.length/2];
	    
	    int index1 = 0;
	    int index2 = 0;
	    for(int i=0; i<c.length; i++) {
	        if(i % 2 == 0) {
	        	a[index1] = c[i];
	        	index1 += 1;
	        } else {
	        	b[index2] = c[i];
	        	index2 += 1;
	        }
	    }
	    System.out.println(Arrays.toString(a));
	    System.out.println(Arrays.toString(b));

	}

}
