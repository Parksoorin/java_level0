package 일차배열6_개념_규칙찾기;

import java.util.Arrays;
import java.util.Random;

public class 배열6_개념02_영일이영일이 {

	public static void main(String[] args) {
		/*
	        [수열]
	            수열이란, 일정한 규칙으로 수가 나열되면, 그규칙을 찾는것을 말한다. 
	
	        [문제]
	            랜덤(2~10)의 숫자를 저장하고 
	            랜덤 개수만큼 반복을 하면서 "영일이수열" 을 arr배열에 저장하시오.
	            "영일이수열" 이란, 0 1 2 0 1 2 0 1 2 을 반복하는것을 말한다.
	        [예시1] 
	            r=8
	            arr=0,1,2,0,1,2,0,1
	        [예시2] 
	            r=4
	            arr=0,1,2,0
	    */
		Random ran = new Random();
		int r = ran.nextInt(9) + 2;
		int[] arr = new int[r];
		System.out.println(r);
		System.out.println(Arrays.toString(arr));
		
	    
	    int num = 0;
	    for(int i = 0; i < r; i++){
	        arr[i] = num;
	        num += 1;
	        if(num == 3){
	            num = 0;
	        }
	    }
	    System.out.println(Arrays.toString(arr));

	}

}
