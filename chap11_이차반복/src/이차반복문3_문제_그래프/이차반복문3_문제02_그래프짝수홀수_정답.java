package 이차반복문3_문제_그래프;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문3_문제02_그래프짝수홀수_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제] 
	            0~9 사이의 랜덤 숫자를 다섯 번 반복해서 저장하고
	            각각 숫자가짝수면 *을 개수만큼 출력하고 홀수이면 !을 개수만큼 출력한다. 
	        [예시]
	            9,2,7,5,8
	            9 : !!!!!!!!!
	            2 : **
	            7 : !!!!!!!
	            5 : !!!!!
	            8 : ********
	    */
		
		Random ran = new Random();
		
	   int[] arr = new int[5];
	   
	   for(int i= 0; i < 5; i++) {
	        int size = ran.nextInt(10);
	        arr[i] = size;
	    }
	    System.out.println(Arrays.toString(arr));

	    for(int i= 0; i < 5; i++) {
	        int size = arr[i];
	        System.out.print(size + " : ");

	        for(int j = 0; j < size; j++) {
	            
	            if(size % 2 == 1){
	                System.out.print("!");
	            }else{
	                System.out.print("*");
	            }
	        }
	        System.out.println();
	    }
	    
	}
}
