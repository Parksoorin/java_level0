package 이차반복문3_문제_그래프;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문3_문제03_그래프자리수_문제 {
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
		int arr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(90) + 10;
			arr[i] = r;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < 5; i++) {
			int a = arr[i]/10;
			int b = arr[i]%10;
			System.out.print((a+b) + " = ");
			for(int j = 0; j < a + b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
