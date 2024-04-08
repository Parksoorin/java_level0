package 일차배열1_문제_기본;

public class 배열1_문제03_검색_자리수2_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에서 십의 자리가 2인 수만 출력하시오.
	        [정답]
	            423
	            124
	            23
	            122   
	    */
	    
	    int[] arr = {510, 423, 124, 512, 252, 23, 312, 453, 122};
	
	    for(int i=0; i<arr.length; i++) {
	        if((arr[i] % 100 / 10) == 2) {
	        	System.out.println(arr[i]);
	        }
	    }

 

	}

}
