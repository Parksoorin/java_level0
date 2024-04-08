package 일차배열1_문제_기본;

import java.util.Arrays;

public class 배열1_문제09_값변경4_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에서 각각의 값의 자리수별로 분리하여 그 곱을 구한후
	            그곱이 홀수이면 원래의 값을 1로 변경하시오.
	            그곱이 짝수이면 원래의 값을 2로 변경하시오.
	        
	        [정답]
	            2,1,2,1,2
	    */
	   
	    int[] arr = {10, 33, 23, 13, 52};
	    
	    for(int i = 0; i < arr.length; i++){
	        int b = (arr[i]/10);
	        int c = arr[i] % 10;
	
	        int d = b * c;
	        if(d % 2 == 0){
	            arr[i] = 2;
	        }else{
	            arr[i] = 1;
	        }
	    }
	    
	    System.out.println(Arrays.toString(arr));

	}

}
