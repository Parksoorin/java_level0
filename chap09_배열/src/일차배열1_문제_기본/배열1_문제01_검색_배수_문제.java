package 일차배열1_문제_기본;

public class 배열1_문제01_검색_배수_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            arr배열에서 3의 배수만 출력하시오.
	        [정답]
	            24
	            12    
	    */
	
	    int[] arr = {10, 43, 24, 12, 52};
	    
	    for(int i = 0; i < arr.length; i++) {
	    	if(arr[i]%3 == 0) {
	    		System.out.println(arr[i]);
	    	}
	    }
	  
	}

}
