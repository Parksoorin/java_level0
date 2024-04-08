package 일차배열4_개념_중요알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열5_개념04_가장큰수 {

	public static void main(String[] args) {

	    /*
	        [문제]
	            arr배열에 -100~100 사이의 랜덤 값 5개 저장한다. 
	            그 중 가장 큰 수와 를 출력하시오. 
	        [예시]
	            -67,10,54,-36,-95
	            54
	    */

	    int[] arr = new int[5];
	    Random ran = new Random();

	    for(int i = 0; i < 5; i++) {
	        arr[i] = ran.nextInt(201) - 100;

	        
	        
	    }
	    int maxNum = arr[0];
	    for(int i = 0; i < 5; i++) {

	        if(maxNum < arr[i]) {
	            maxNum = arr[i];
	        }
	        
	    }
	    System.out.println(Arrays.toString(arr));
	    System.out.println(maxNum);

	}

}
