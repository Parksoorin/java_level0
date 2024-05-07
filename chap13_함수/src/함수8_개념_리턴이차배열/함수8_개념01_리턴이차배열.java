package 함수8_개념_리턴이차배열;

import java.util.Arrays;
import java.util.Random;

public class 함수8_개념01_리턴이차배열 {	
	/*
		[문제] 
			이차원배열의 세로와 가로를 저장하면,
			그 숫자만큼 랜덤으로 숫자를 넣어서 
			이차원 배열로 반환해주는 함수를 만드시오.
		[예시]
			4, 3
	
			[1, 2, 3]
			[4, 5, 6]
			[7, 8, 9]
			[10, 11, 12]
	
	*/

	public static int[][] getDoubleArr(int row , int col) {
		int [][] arr = new int[row][col];
		int num = 1;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = num;
				num += 1;
			}
		}
		return arr;
	}
	public static void main(String[] args) {	
		
		int row = 4;
		int col = 3;
		System.out.println(row + ","+ col);
		int arr[][] = getDoubleArr(row, col);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
