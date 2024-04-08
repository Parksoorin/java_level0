package 일차배열1_문제_기본;

import java.util.Arrays;

public class 배열1_문제08_값변경3_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에서 각각의 값의 자리수별로 분리하여 양쪽을 비교후 
	            더크거나 같은값으로 원래의 값을 변경하시오.
	        
	        [정답]
	            1,4,4,2,5
	    */
	   
	    int[] arr = {10, 43, 24, 22, 52};
	    
	    for(int i = 0; i < arr.length; i++){
	        int b = (arr[i]/10);
	        int c = arr[i] % 10;
	
	        if(b >= c){
	            arr[i] = b;
	        }
	        if(c >= b){
	            arr[i] = c;
	        }
	
	    }
	    
	    System.out.println(Arrays.toString(arr));

	}

}
