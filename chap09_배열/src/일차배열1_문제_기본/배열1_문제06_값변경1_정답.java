package 일차배열1_문제_기본;

import java.util.Arrays;

public class 배열1_문제06_값변경1_정답 {

	public static void main(String[] args) {

	    /*
	        [문제]
	            arr배열에서 각각값을 검사하여 짝수는 원래의 값에1을 더하시오.
	        [정답]
	            11,43,25,13,53
	    */

	    int arr[] = {10, 43, 24, 12, 52};
	    
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] % 2 == 0){
	            arr[i] += 1;
	        }
	    }

	    System.out.println(Arrays.toString(arr));

	}

}
