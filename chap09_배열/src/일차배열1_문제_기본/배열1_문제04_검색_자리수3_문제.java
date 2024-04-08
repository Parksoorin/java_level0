package 일차배열1_문제_기본;

public class 배열1_문제04_검색_자리수3_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            arr배열에서 십의 자리가 2이거나 백의 자리가 5인 수만 출력하시오.
	        [정답]
	            510
	            423
	            124
	            512
	            23
	            122   
	    */
	
	    int arr[] = {510, 423, 124, 512, 252, 23, 312, 453, 122};
	
	    for(int i=0; i < arr.length; i++) {
	    	int a = arr[i] % 100 / 10;
	    	int b = arr[i] / 100;
	        if(a == 2 || b == 5) {
	        	System.out.println(arr[i]);
	        }
	    }


	}

}
