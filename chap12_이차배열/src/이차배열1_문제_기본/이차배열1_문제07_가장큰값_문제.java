package 이차배열1_문제_기본;

import java.util.Arrays;
import java.util.Random;

public class 이차배열1_문제07_가장큰값_문제 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            [1] arr배열에 랜덤 값(1~100)을 9개 저장 후 출력하시오.
	            [2] 그 중에 가장 큰 값을 출력하시오.
	        [예시]
	            [25, 11, 1]
				[67, 12, 96]
				[8, 17, 86]
				------
				96


		  */
		
		Random ran = new Random();
		int arr[][] = new int[3][3];
		int max = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int r = ran.nextInt(100)+1;
				arr[i][j] = r;
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(max);
	}


}