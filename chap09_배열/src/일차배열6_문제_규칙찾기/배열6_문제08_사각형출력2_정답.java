package 일차배열6_문제_규칙찾기;

public class 배열6_문제08_사각형출력2_정답 {

	public static void main(String[] args) {
		/*
	        [문제]	
	            아래 arr배열의 값을 사각형 모양으로 출력하시오.
	        [정답]
	            1 1 
	            1 1 
	            1 1 
	            1 1
	            1 1
	            1 1
	    */
	
	    int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	
	    for(int i=0; i<arr.length; i++) {
	        System.out.print(arr[i] + " ");
	        if(i % 2 == 1) {
	        	System.out.println();
	        }
	    }


	}

}
