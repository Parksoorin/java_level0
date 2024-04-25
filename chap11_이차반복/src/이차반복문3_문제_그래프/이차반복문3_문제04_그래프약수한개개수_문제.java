package 이차반복문3_문제_그래프;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문3_문제04_그래프약수한개개수_문제 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            랜덤숫자(10~20)를 하나 저장한다.
	            그숫자의 약수들을 배열에 저장한다.
	            그약수숫자만큼 별을 그리시오.
	        [예시]
	            12=1,2,3,4,6,12
	            *
	            **
	            ***
	            ****
	            ******
	            ************
	    */
		
		Random ran = new Random();
		
		int r = ran.nextInt(11) + 10;
		System.out.println("r = " + r);
		
		int cnt = 0;
		for(int i = 1; i <= r; i++) {
			if(r % i == 0) {
				cnt++;
			}
		}
		System.out.println("cnt = " + cnt);
		
		int arr[] = new int[cnt];
		
		int index = 0;
		for(int i = 1; i <= r; i++) {
			if(r % i == 0) {
				arr[index] = i;
				index++;
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println("arr = " + Arrays.toString(arr));
	   
		
	}
}
