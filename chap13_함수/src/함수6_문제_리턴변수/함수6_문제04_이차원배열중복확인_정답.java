package 함수6_문제_리턴변수;

import java.util.Random;

public class 함수6_문제04_이차원배열중복확인_정답 {	
	
	public static boolean getCheckDoubleArr(int[][] arr, int a) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == a) {
					return true;
				}
			}
		}
		
		return false;
	}
	public static void main(String[] args) {	
		/*
		 [문제]
			num 의 값이 darr 안에 있으면 true , 없으면 false 를 출력하시오.
		[정답]
			true
		 */		
		int[][] darr = {
				{ 1, 43,   3, 54,  1},
	    		{45, 41, 455,  4,  6},
    			{ 5, 21,  51, 32, 13}};
		int num = 3;
		
		boolean check = getCheckDoubleArr(darr, num);
		System.out.println(check);
	}
}
