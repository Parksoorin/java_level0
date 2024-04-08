package 일차배열1_개념_기본;

public class 배열1_개념08_검색_자리수2 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            a배열에서 십의 자리가 2인 수만 출력하시오.
	        [정답]
	            423
	            124
	            23
	            122    
	    */
	
	    int[] arr = {510, 423, 124, 512, 252, 23, 312, 453, 122};
	
	    for(int i=0; i<arr.length; i++) {
	        int unit = (arr[i] % 100 / 10);
	
	        if(unit == 2) {
	        	System.out.println(arr[i]);
	        }
	    }

	}

}
