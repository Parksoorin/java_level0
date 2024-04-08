package 일차배열6_문제_규칙찾기;

import java.util.Arrays;

public class 배열6_문제01_거꾸로추가_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            a베열 값을  b배열에 추가하시오.
	            단, 값을 거꾸로 추가하시오.
	        [정답]
	            b = 40,30,20,10
	    */
	
	    int[] a = {10, 20, 30, 40};
	    int[] b = new int[a.length];
	
	    /*
	        방   =  값;
	        b[0] = a[3]
	        b[1] = a[2]
	        b[2] = a[1]
	        b[3] = a[0]
	    */
	
	    int index = a.length - 1;
	
	    for(int i=0; i<a.length; i++) {
	        b[i] = a[index];
	        index -= 1;
	    }
	    
	    System.out.println(Arrays.toString(b));

	}

}
