package 일차배열8_문제_무한반복;

import java.util.Arrays;
import java.util.Random;

public class 배열8_문제04_다른숫자20_정답 {

	public static void main(String[] args) {
 /*
        
        [문제]
            [조건1] arr배열에 1~10 사이의 랜덤숫자 3개를 추가한다.
            [조건2] 그합이 20 이면 종료한다.
            [조건3] 3숫자가 전부 다른숫자여야한다. 
        [예시]
            arr = 2,10,8
    */

	    int arr[] = new int[3];
	    Random ran = new Random();
	    while(true) {
	    	int a= ran.nextInt(10) + 1;
	    	int b = ran.nextInt(10) + 1;
	    	int c = ran.nextInt(10) + 1;
	
	        int total = a + b + c;
	        boolean d = a != b && b != c && c != a;
	        if(total == 20 && d){
	        	arr[0] = a;
	        	arr[1] = b;
	        	arr[2] = c;
	            break;
	        }
	       
	    }
	    System.out.println(Arrays.toString(arr));

	}

}
