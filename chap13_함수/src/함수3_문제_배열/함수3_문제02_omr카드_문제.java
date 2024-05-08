package 함수3_문제_배열;

import java.util.Arrays;
import java.util.Random;

public class 함수3_문제02_omr카드_문제 {

	public static void solution(int[] arr, int[] omr) {
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] == omr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1, 4, 3, 2, 1};
		
		/*
         	[문제]
         		int [] arr = {1, 4, 3, 2, 1};
	            omr배열은 정답이다.
	            me배열에 랜덤숫자(1~4)를 5개 저장 후,
	            omr과 비교하여 정답개수를 출력해주는 함수를 만드시오.
	        [예시]
	            [1, 4, 3, 2, 1]
				[3, 4, 2, 2, 3]
				2
	    */
		
		Random ran = new Random();
		int omr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(4) + 1;
			omr[i] = r;
		}
		System.out.println("정답 = " + Arrays.toString(arr));
		System.out.println("omr = " + Arrays.toString(omr));
		
		solution(arr, omr);
	}
}
