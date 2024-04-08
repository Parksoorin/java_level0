package 일차배열6_문제_규칙찾기;

import java.util.Arrays;

public class 배열6_문제06_두개씩저장_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            배열a에 있는 값들을 배열b에 저장하려고 한다. 
	            배열a의 값을  두 개씩 저장하시오.
	        [정답]
	            b = 1,1,3,3,7,7
	    */
	
	    int[] a = {1, 3, 7};
	    int[] b = new int[a.length*2];
	    int index = 0;
	    for(int i = 0; i < a.length; i++){
	    	b[index] = a[i];
	    	index += 1;
	    	b[index] = a[i];
	    	index += 1;
	    }
	    System.out.println(Arrays.toString(b));
	}

}
