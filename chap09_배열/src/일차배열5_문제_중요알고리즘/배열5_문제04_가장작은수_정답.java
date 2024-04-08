package 일차배열5_문제_중요알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열5_문제04_가장작은수_정답 {

	public static void main(String[] args) {
		/*
	        [문제]
	            arr배열에 -100~100 사이의 랜덤 값 5개 저장한다. 
	            그 중 가장 큰 수와 가장 작은 수를 출력하시오. 
	        [예시]
	            37, 53, 90, -82, -17
	            -82    
	    */
	
	    int arr[] = new int[5];
	    Random ran = new Random();
	    
	    
	
	    for(int i=0; i<5; i++) {
	        arr[i] = ran.nextInt(201) - 101;
	      
	    }
	    
	    int minNum = arr[0];
	    for(int i = 0; i < 5; i++) {
	    	if(minNum > arr[i]) {
	    		minNum = arr[i];
	    	}
	    }
	    System.out.println(Arrays.toString(arr));
	    System.out.println(minNum);
	    

	}

}
