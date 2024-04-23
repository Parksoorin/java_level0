package 이차반복문3_문제_그래프;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문3_문제05_그래프자리수홀수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            100~999 사이의 랜덤 숫자를 다섯 번 반복해서 저장하고,
	            각각의숫자의 자리수로 나눈다. 각각의 자리수의 홀수만 더한다.
	            홀수의 합만큼 별을출력하시오.
	        [예시]
	            60,72,29,82,36
	            0=
	            7=*******
	            9=*********
	            0=
	            3=***
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
	        int a = value/100;
	        int b = value  % 100 / 10;
	        int c = value % 10;
	        int count = 0;
	        if(a % 2== 1){
	            count += a;
	        }
	        if(b % 2 == 1){
	            count += b;
	        }
	        if(c % 2 == 1){
	            count += c;
	        }
	        System.out.print(count+"=");
	        for(int j = 0; j < count; j++) {
	            System.out.print("*");
	        }
	        
	        System.out.println();
	    }
	    
	}
}
