package 일차배열5_문제_중요알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열5_문제02_랜덤셔플2_정답 {

	public static void main(String[] args) {
		 /*
	        [문제]
	           
	            랜덤으로 셔플후 출력하시오.
	            단, 첫번째 값은 그대로 두고 나머지 값만 셔플하시오.
	        [예시]
	            10,50,30,20,40
	    */
	
	    int[] arr = {10, 20, 30, 40, 50};
	
	    int size = arr.length;
	
	    int size2 = size - 1;
	    Random ran = new Random();
	    
	    for(int i = 0; i < 100; i++){
	        
	    	int a = ran.nextInt(size2) + 1; // 1~4 (첫번째는 건들지않는다)
	    	int b = ran.nextInt(size2) + 1;
	        
	        int c = arr[a];
	        arr[a] = arr[b];
	        arr[b] = c;
	    }
	    System.out.println(Arrays.toString(arr));

	}

}
