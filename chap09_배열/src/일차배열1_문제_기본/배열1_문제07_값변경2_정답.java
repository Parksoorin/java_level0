package 일차배열1_문제_기본;

import java.util.Arrays;

public class 배열1_문제07_값변경2_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에서 각각의 값의 자리수별로 분리하여 원래의 값을 그합으로 변경하시오.
	        [정답]
	            1,7,6,3,7
	    */
	
	    int[] arr = {10, 43, 24, 12, 52};
	    
	    for(int i = 0; i < arr.length; i++){
	        int b = (arr[i]/10);
	        int c = arr[i] % 10;
	
	        arr[i] = b + c;
	
	    }
	    
	    System.out.println(Arrays.toString(arr));

	}

}
