package 이차반복문3_문제_그래프;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문3_문제03_그래프자리수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            10~99 사이의 랜덤 숫자를 다섯 번 반복해서 저장하고,
	            각각의숫자의 자리수로 나눈다. 각각의 자리수의 합만큼 별을출력하시오.
	        [예시]
	            53,27,38,41,90
	            8=********
	            9=*********
	            11=***********
	            5=*****
	            9=*********
	    */
		Random ran = new Random();
		
	   int[] arr = new int[5];
	   for(int i= 0; i < 5; i++) {
	        int size = ran.nextInt(90) + 10;
	        arr[i] = size;
	    }
	    System.out.println(Arrays.toString(arr));

	    for(int i= 0; i < 5; i++) {
	        int value = arr[i];
	        int a = value/10;
	        int b = value % 10;
	        int c = a + b;
	        System.out.print(c+"=");
	        for(int j = 0; j < c; j++) {
	            System.out.print("*");
	        }
	        
	        System.out.println();
	    }
	    
		
	}
}
