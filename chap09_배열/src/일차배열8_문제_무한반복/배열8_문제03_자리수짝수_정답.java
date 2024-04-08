package 일차배열8_문제_무한반복;

import java.util.Arrays;
import java.util.Random;

public class 배열8_문제03_자리수짝수_정답 {

	public static void main(String[] args) {
			/*
		        
		        [문제]
		            [조건1] arr배열에 10~99 사이의 랜덤숫자 3개를 추가한다.
		            [조건2] 그 각자리수가 전부 짝수이면 저장한다.
		        [예시]
		            arr = 20,28,22
		    */
			
	    int[] arr = new int[3];
	    
	    Random ran = new Random();
	    while(true) {
	    	int a = ran.nextInt(90)+ 10;
	    	int b = ran.nextInt(90)+ 10;
	    	int c = ran.nextInt(90)+ 10;
	    	
	    	int a1 = a / 10;
	    	int a2 = a % 10;
	    	int b1 = b / 10;
	    	int b2 = b % 10;
	    	int c1 = c / 10;
	    	int c2 = c % 10;
	        
	
	        boolean d = a1 % 2 == 0 && a2 % 2 == 0 && b1 % 2 == 0 && b2 % 2 == 0 && c1 % 2 == 0 && c2 % 2 == 0;
	        if(d){
	        	arr[0] = a;
	        	arr[1] = b;
	        	arr[2] = c;
	            break;
	        }
	        
       
    	}
	    System.out.println(Arrays.toString(arr));

	}

}
