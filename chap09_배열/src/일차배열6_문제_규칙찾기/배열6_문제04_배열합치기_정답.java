package 일차배열6_문제_규칙찾기;

import java.util.Arrays;

public class 배열6_문제04_배열합치기_정답 {

	public static void main(String[] args) {
		/*
	        [문제] 
	            a배열의 값을 순차적으로 c배열에 저장하고,
	            그 후 b배열의 값을 c배열의 그 뒤부터 저장하시오.
	        [정답] 
	            a = 10,20,30
	            b = 40,50,60,70
	            
	            c = 10,20,30,40,50,60,70
	    */
	
	    int[] a = {10, 20, 30};
	    int[] b = {40, 50, 60, 70};
	
	    int[] c = new int[a.length + b.length];
	    int index = 0;
	    
	    for(int i = 0; i < a.length; i++) {
	    	c[index] = a[i];
	    	index += 1;
	    }
	    for(int i = 0; i < b.length; i++) {
	    	c[index] = b[i];
	    	index += 1;
	    }
	    
	    System.out.println(Arrays.toString(c));

	}

}
