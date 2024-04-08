package 일차배열4_개념_중요알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열5_개념02_랜덤셔플 {

	public static void main(String[] args) {
		/*
	        [문제] 	
	            1. 인덱스 2개를 랜덤(0~4)으로 저장하고 각 인덱스의 값을 교환한다.
	            2. 위 1번을 10회 반복하며 과정을 출력하시오.
	        [예시] 		
	            예) 1, 2 ==> 10,30,20,40,50  // 20 과 30이 교환된다.		
	            예) 4, 1 ==> 10,50,20,40,30  // 50 과 30이 교환된다.	
	            예) 3  3 ==> 10,50,20,40,30  // 같을 땐 아무일도안생긴다.    
	    */
	
	    Random ran = new Random();
	    int[] arr = {10, 20, 30, 40, 50};
	
	    for(int i=0; i < 10; i++) {
	        int index1 = ran.nextInt(arr.length);
	        int index2 = ran.nextInt(arr.length);
	
	        int temp = arr[index1];
	        arr[index1] = arr[index2];
	        arr[index2] = temp;
	       System.out.println(index1 + " " + index2);
	       System.out.println(Arrays.toString(arr));
	    }

	}

}
