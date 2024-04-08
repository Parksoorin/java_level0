package 일차배열6_문제_규칙찾기;

import java.util.Arrays;
import java.util.Random;

public class 배열6_문제02_일이삼일이삼_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            랜덤(2~10)의 숫자를 저장하고 
	            랜덤 개수만큼 반복을 하면서 "일이삼수열" 를 arr배열에 저장하시오.
	            "일이삼수열" 이란, 1 2 3 1 2 3 1 2 3 을 반복하는 규칙을말한다.
	        [예시1] 
	            r = 8
	            arr = 1,2,3,1,2,3,1,2
	        [예시2] 
	            r = 4
	            arr = 1,2,3,1
	    */
		Random ran = new Random();
		int r = ran.nextInt(9) + 2;
		int[] arr = new int[r];
		System.out.println(r);
		
	    int num = 1;
	    for(int i=0; i<r; i++) {
	        arr[i] = num;
	        num += 1;
	        
	        if(num == 4) {
	            num = 1;
	        }
	    }
	    
	    System.out.println(Arrays.toString(arr));
	}

}
