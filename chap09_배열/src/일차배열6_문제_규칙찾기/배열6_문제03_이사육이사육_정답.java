package 일차배열6_문제_규칙찾기;

import java.util.Arrays;
import java.util.Random;

public class 배열6_문제03_이사육이사육_정답 {

	public static void main(String[] args) {
		/*
	        [수열]
	            수열이란, 일정한 규칙으로 수가 나열되면, 그규칙을 찾는것을 말한다. 
	
	        [문제]
	            랜덤(2~10)의 숫자를 저장하고 
	            랜덤 개수만큼 반복을 하면서 "이사육수열" 을 arr배열에 저장하시오.
	            "이사육수열" 이란, 2 4 6 2 4 6 2 4 6 을 반복해서 저장하는 것이다.
	        [예시1] 
	            r = 8
	            arr = 2,4,6,2,4,6,2,4
	        [예시2] 
	            r = 4
	            arr = 2,4,6,2
	    */
		Random ran = new Random();
		int r = ran.nextInt(9) + 2;
		int[] arr = new int[r];
		System.out.println(r);
		
	    int num = 2;
	    for(int i=0; i<r; i++) {
	        arr[i] = num;
	        num += 2;
	        
	        if(num == 8) {
	            num = 2;
	        }
	    }
	    System.out.println(Arrays.toString(arr));

	}

}
