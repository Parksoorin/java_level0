package 이차반복문3_문제_그래프;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문3_문제01_그래프_정답 {

	public static void main(String[] args) {
		 /*
	        [문제] 
	            0~9 사이의 랜덤 숫자를 다섯 번 반복해서 저장하고
	            각각의 배열 숫자만큼 * 을 가로로 출력하시오.
	            다음 *을 줄바꿈후 출력한다.
	        [예시]
	            1 : *
	            9 : **********
	            0 :
	            7 : *******
	            4 : ****  
	    */
	
		Random ran = new Random();
		
	    int[] arr = new int[5];
	    for(int i= 0; i < arr.length; i++) {
	        int size = ran.nextInt(10);
	        arr[i] = size;
	    }
	    System.out.println(Arrays.toString(arr));
	
	    for(int i= 0; i < arr.length; i++) {
	        int size = arr[i];
	        System.out.print(size + " : ");
	
	        for(int j = 0; j < size; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	}

}
