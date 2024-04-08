package 일차배열6_개념_규칙찾기;

public class 배열6_개념03_사각형출력 {

	public static void main(String[] args) {
		/*
	        [문제]	
	            아래 arr배열의 값을 정사각형 모양으로 출력하시오.
	        [정답]
	            1 2 3
	            4 5 6
	            7 8 9    
	    */
	
	    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	    for(int i=0; i<arr.length; i++) {
	        System.out.print(arr[i] + " ");
	        if(i % 3 == 2) {
	        	System.out.println();
	        }
	    }
	}

}
