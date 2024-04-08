package 일차배열3_문제_비교;

import java.util.Arrays;

public class 배열3_문제05_구구단게임_문제 {

	public static void main(String[] args) {
		/*
	        [문제]
	            배열 a와 b의 각 자리의 곱을 total의 각 자리에 저장 후 출력하시오. 
	            단, op 의 값이 0이면 양수로 저장하고,
	            1이면 음수로 저장하시오.
	        [정답]
	            15,-12,2,56,-18
	        [설명]
	            a = 3 , b = 5 , op = 0 이므로 양수로 저장 total = 15
	            a = 4 , b = 3 , op = 1 이므로 음수로 저장 total = 15, -12
	            a = 2 , b = 1 , op = 0 이므로 양수로 저장 total = 15, -12, 2
	            a = 8 , b = 7 , op = 0 이므로 양수로 저장 total = 15, -12, 2, 56
	            a = 8 , b = 7 , op = 1 이므로 음수로 저장 total = 15, -12, 2, 56, -18
	    */
	
	    int[] a  = {3, 4, 2, 8, 6};
	    int[] b  = {5, 3, 1, 7, 3};
	    int[] op = {0, 1, 0, 0, 1};
	    
	    int[] total = {0, 0, 0, 0, 0};
	
	   
	}

}
