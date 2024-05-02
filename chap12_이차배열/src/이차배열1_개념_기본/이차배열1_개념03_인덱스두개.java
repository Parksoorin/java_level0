package 이차배열1_개념_기본;

import java.util.Arrays;
import java.util.Random;

public class 이차배열1_개념03_인덱스두개 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            darr배열에 10~90까지 값을 저장 후
	            랜덤으로 값 하나를 출력하시오.
	        [예시]
	            darr :  [[10, 20, 30], [40, 50, 60], [70, 80, 90]]
	            r1 : 1  r2 : 0
	            40    
	    */
		Random ran = new Random();
		int[][] darr = new int[3][3];
		int num = 1;
	    for(int i=0; i<darr.length; i++) {
	        for(int j=0; j<darr[i].length; j++) {
	            darr[i][j] = num;
	            num += 1;
	        }
	    }
	    
	    for(int i = 0; i < darr.length; i++) {
	    	System.out.println(Arrays.toString(darr[i]));
	    }
	    
	    int r1 = ran.nextInt(3);
	    int r2 = ran.nextInt(3);
	    System.out.println(darr[r1][r2]);
	}

}
