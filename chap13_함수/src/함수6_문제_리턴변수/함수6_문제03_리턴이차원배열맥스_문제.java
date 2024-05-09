package 함수6_문제_리턴변수;


public class 함수6_문제03_리턴이차원배열맥스_문제 {	
	
	public static int getDoubleArrMax(int[][] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {	
		/*
		 [문제]
			이차원 배열에서 가장 큰 수를 
			반환하는 함수를 만드시오.
		[정답]
			455
		 */		
		int[][] darr = {
			{ 1, 43,   3, 54,  1},
    		{45, 41, 455,  4,  6},
			{ 5, 21,  51, 32, 13}
	    };
		
		int a = getDoubleArrMax(darr);
		
		System.out.println(a);
		
	}
}
