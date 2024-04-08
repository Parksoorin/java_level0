package 일차배열8_개념_무한반복;

import java.util.Arrays;
import java.util.Random;

public class 배열8_개념02_홀수만저장 {

	public static void main(String[] args) {
		/*
	        [문제]
	            [조건1] arr배열에 1~100 사이의 랜덤숫자 5개를 추가한다.
	            [조건2] 단, 홀수만 저장한다.  
	        [예시]
	            arr = 13,43,3,17,33
    */

	    int[] arr = new int[5];
	
	    int count = 0;
	    Random ran = new Random();
	    while(true) {
	    	int num = ran.nextInt(100) + 1;
	        
	        if(num % 2 != 0) {
	        	arr[count] = num;
	            count += 1;
	
	            if(count == 5) {
	                break;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}

}
