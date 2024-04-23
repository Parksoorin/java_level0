package 이차반복문7_문제_종합응용;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문7_문제02_토탈배열_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            [1] 1~9 사이의 랜덤 숫자 다섯개의 합을 
	                total배열에 추가한다. 
	            [2] 위 내용을 10번 반복하시오.
	        [예시]
	            7 2 8 4 5  : 26
	            2 6 2 6 8  : 24
	            4 6 7 1 5  : 23
	            1 9 8 6 9  : 33
	            6 1 3 1 2  : 13
	            4 3 7 5 2  : 21
	            6 2 7 9 3  : 27
	            5 1 4 4 3  : 17
	            1 3 9 4 6  : 23
	            8 3 4 9 5  : 29
	            total = [26, 24, 23, 33, 13, 21, 27, 17, 23, 29]
	    */

		Random ran = new Random();
		
	    int[] total = new int[10];

	    for(int i=0; i<10; i++) {
	        int sum = 0;
	        
	        for(int j=0; j<5; j++) {

	            int num = ran.nextInt(9) + 1;
	            System.out.print(num + " ");

	            sum += num;
	        }
	        System.out.println(": " + sum);

	        total[i] = sum;
	    }

	    System.out.println("total = " + Arrays.toString(total));

		
	}
}
