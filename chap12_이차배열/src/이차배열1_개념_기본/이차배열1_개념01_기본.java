package 이차배열1_개념_기본;

import java.util.Arrays;

public class 이차배열1_개념01_기본 {
	public static void main(String[] args) {
		int[] temp = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(temp));
		System.out.println(temp.length);
		
		int[][] darr = new int[2][3];
		darr[0][0] = 1;
		darr[0][1] = 2;
		darr[0][2] = 3;
		darr[1][0] = 4;
		darr[1][1] = 5;
		darr[1][2] = 6;
		
		
		for(int i=0; i<darr.length; i++) {
			for(int j=0; j<darr[i].length; j++) {
				System.out.println(darr[i][j]);
			}
		}
		System.out.println();

		System.out.println(Arrays.toString(darr[0]));
		System.out.println(Arrays.toString(darr[1]));
		
		for(int i=0; i<2; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
		
		System.out.println(darr.length);		// 행의 길이
		System.out.println(darr[0].length);	// 열의 길이
		System.out.println(darr[1].length);
	}
}
