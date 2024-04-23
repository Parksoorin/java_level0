package 이차반복문3_개념_그래프;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문3_개념01_랜덤가로사이즈 {

	public static void main(String[] args) {
		 /*
	        [문제] 
	            1~9 사이의 랜덤 숫자를 다섯 번 반복해서 arr배열에 저장하고, 
	            랜덤 숫자 개수만큼 출력하시오.
	        [예시]
	            예를 들어 4, 5, 3, 1, 2 가 나왔다고 한다면,
	            4444
	            55555
	            333
	            1
	            22    
	    */
	
	    int arr[] = new int[5];
	    Random ran = new Random();
	    for(int i=0; i < 5; i++) {
	    	int a = ran.nextInt(9) + 1;
	    	arr[i] = a;
	    }
	    System.out.println(Arrays.toString(arr));
	
	    for(int i=0; i < 5; i++) {
	
	        int size = arr[i];
	
	        for(int j = 0; j < size; j++) {
	        	System.out.print(size);
	
	        }
	        System.out.println();
	    }
    

	}

}
