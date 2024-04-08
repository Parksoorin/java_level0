package 일차배열3_문제_비교;

import java.util.Arrays;

public class 배열3_문제06_연산자게임_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            배열 a와 b의 각 자리의 숫자끼리 더하기 또는 빼기 또는 곱하기를 해서 
	            배열 total에 저장하려 한다.
	            더하기, 빼기, 또는 곱하기는 op의 값으로 정한다. 
	            op가 0 이면 더하기 
	            op가 1 이면 빼기
	            op가 2 이면 곱하기이다. 
	        [정답]
	            a = 3 , b = 5 , op = 0 은 더하기 이다 : total = 8
	            a = 4 , b = 3 , op = 1 은 빼기 이다   : total = 8, 1
	            a = 2 , b = 1 , op = 0 은 더하기 이다 : total = 8, 1, 3
	            a = 8 , b = 7 , op = 2 는 곱하기 이다 : total = 8, 1, 3, 56
	            a = 6 , b = 3 , op = 1 은 빼기 이다   : total = 8, 1, 3, 56, 3
	
	            total = 8, 1, 3, 56, 3    
	    */
	
	    int[] a = {3, 4, 2, 8, 6};
	    int[] b = {5, 3, 1, 7, 3};
	    int[] op = {0, 1, 0, 2, 1};
	    
	    int[] total = {0,0,0,0,0};
	
	
	    int size = a.length;
	    for(int i=0; i<size; i++) {
	
	        int result = 0;
	        if(op[i] == 0) {
	            result = a[i] + b[i];
	        } else if(op[i] == 1) {
	            result = a[i] - b[i];
	        } else if(op[i] == 2) {
	            result = a[i] * b[i];
	        }
	        total[i] = result;
	    }
	    System.out.println(Arrays.toString(total));

	}

}
