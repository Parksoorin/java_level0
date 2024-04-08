package 일차배열1_개념_기본;

public class 배열1_개념06_검색_배수 {

	public static void main(String[] args) {
		/*
			[문제] 아래 배열의 값 중에 4의 배수만 출력하시오.
			[정답] 20 40    
	    */
	
	    int[] arr = {10, 20, 30, 40, 50};
	
	    for(int i=0; i<arr.length; i++) {
	        if(arr[i] % 4 == 0) {
	            System.out.println(arr[i]);
	        }
	    }
	}
	
}
