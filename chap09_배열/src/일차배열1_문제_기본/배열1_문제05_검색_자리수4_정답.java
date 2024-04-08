package 일차배열1_문제_기본;

public class 배열1_문제05_검색_자리수4_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            arr배열에서 십의 자리가 1이고, 백의 자리가 5인 수만 출력하시오.
	        [정답]
	            510
	            512    
	    */
	
	    int[] arr = {510, 423, 124, 512, 252, 23, 312, 453, 122};
	
	    for(int i=0; i<arr.length; i++) {
	        int hundredUnit = (arr[i] / 100);
	        int tenUnit = (arr[i] % 100 / 10);
	
	        if(hundredUnit == 5 && tenUnit == 1) {
	        	System.out.println(arr[i]);
	        }
	    }

	}

}
