package 일차배열1_개념_기본;

public class 배열1_개념07_검색_자리수1 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에서 백의 자리가 2인 수만 출력하시오.
	        [정답]
	            1210
	            1212    
	    */
	
	    int arr[] = {1210, 1343, 1524, 1212, 7452};
	
	    for(int i=0; i<arr.length; i++) {
	        int unit = (arr[i] % 1000 / 100);
	
	        if(unit == 2) {
	        	System.out.println(arr[i]);
	        }
	    }

	}

}
