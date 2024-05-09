package 함수7_문제_리턴배열;

import java.util.Arrays;
import java.util.Random;

public class 함수7_문제04_석차출력_문제 {	
	
	public static int[] getRank(int[] arr) {
		int rank[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int cnt = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					cnt++;
				}
			}
			rank[i] = cnt;
		}
		return rank;
	}
	public static void main(String[] args) {	
		/*
		    [문제]
	            scoreList는 학생시험점수배열이다. 
	            석차를 배열에 담아서 리턴하는함수를 만드시오.
        	[정답]
            	2 3 4 1 
		*/		
		
		int[] arr = {87,   42,   11,   98};
		
		int rank[] = getRank(arr);
		
		System.out.println(Arrays.toString(rank));
	}
}
