package 이차반복문3_문제_그래프;

import java.util.Random;

public class 이차반복문3_문제06_약수여러개출력_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            10~100 사이의 랜덤 숫자를 다섯 개를 배열에 저장한다. 
	            각 숫자의 약수를 전부 출력한다. 
	        [예시]    
	            52 : 1 2 4 13 26 52 
	            81 : 1 3 9 27 81 
	            28 : 1 2 4 7 14 28
	            11 : 1 11
	            52 : 1 2 4 13 26 52    
	    */
		
		Random ran = new Random();
		
	    int[] arr = new int[5];
	    for(int i = 0; i < 5; i++) {
	        int num = ran.nextInt(91) + 10;
	        arr[i] = num;
	    }

	    for(int i = 0; i < 5; i++) {

	        int size = arr[i];
	        System.out.print(size + " : ");

	        for(int j = 1; j <= size; j++) {

	            if(size % j == 0) {
	                
	                System.out.print(j + " ");
	            }
	        }
	        System.out.println();
	    }

	}
}
