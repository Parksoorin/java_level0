package 이차배열1_문제_기본;

import java.util.Arrays;
import java.util.Random;

public class 이차배열1_문제02_기본_문제 {

	public static void main(String[] args) {
		/*
        [문제]
            darr배열을 한 줄당 3개씩 3줄 총 9개로 이차원으로 만들고, 
            랜덤값(1~100)을 9개 저장하시오.
             arr배열의 값 중에서 50이상을 전부 출력하시오.
        [예시]
            [42, 60, 31]
			[42, 73, 84]
			[83, 29, 23]
			60
			73
			84
			83  
    */
		
		Random ran = new Random();
		int darr[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				int r = ran.nextInt(100) + 1;
				darr[i][j] = r;
			}
			System.out.println(Arrays.toString(darr[i]));
		}
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(darr[i][j] >= 50) {
					System.out.println(darr[i][j]);
				}
			}
		}
		
	}

}
