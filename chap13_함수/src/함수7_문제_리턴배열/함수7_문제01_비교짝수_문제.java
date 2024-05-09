package 함수7_문제_리턴배열;

import java.util.Arrays;

public class 함수7_문제01_비교짝수_문제 {	
	
	public static int[] getArrEven(int[] a, int[] b) {
		int result[] = new int[a.length + b.length];
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j] && a[i] % 2 == 0) {
					result[index] = a[i];
					index++;
				}
			}
		}
		
		int temp[] = new int[index];
		for(int i = 0; i < index; i++) {
			temp[i] = result[i];
		}
		return temp;
	}
	public static void main(String[] args) {	
		/*
		    [문제]
            a배열과 b배열 전체를 비교하여 
            a배열 안에도 있고 b배열 안에도 있는 값은 
            c배열에 저장하시오. 
            단, 짝수만 저장하고 리턴하는 함수를 만드시오.

        [정답]
            2, 6   
		 */		
		 int[] a = {1, 2, 7, 40, 3, 6};
		 int[] b  = {1, 6, 2,  9, 3, 7};
		
		 int[] result = getArrEven(a, b);
		 System.out.println(Arrays.toString(result));
	}
}
