package 이차반복문7_문제_종합응용;

import java.util.Arrays;
import java.util.Random;

public class 이차반복문7_문제05_맥스게임_정답 {
	public static void main(String[] args) {
		
	    /*
	        [문제]
	            0~4 사이의 랜덤 숫자를 저장해 arr배열에서 그 위치의 값이
	            최대값인지 검사한다.
	            만약 최대값이면 그 위치의 값을 0으로 바꾸고,
	            전부 0이되면 종료한다. 
	            과정을 전부 출력하시오.
	        [예시]
	            랜덤 : 3
	            [11, 87, 42, 0, 24]

	            랜덤 : 0
	            [11, 87, 42, 0, 24]   <- 최대값이 아니므로 그대로 유지

	            랜덤 : 1
	            [11, 0, 42, 0, 24]

	            ...
	    */

		Random ran = new Random();
		
	    int[] arr = {11, 87, 42, 100, 24};

	    int count = 0;
	    while(true) {
	        int index = ran.nextInt(arr.length);
	        System.out.println("랜덤 = " + index);

	        int maxNum = 0;
	        int maxIndex = 0;
	        for(int i=0; i<arr.length; i++) {
	            if(maxNum < arr[i]) {
	                maxNum = arr[i];
	                maxIndex = i;
	            }
	        }

	        if(index == maxIndex) {
	            arr[index] = 0;
	            count += 1;
	        }
	        System.out.println(Arrays.toString(arr));
	        System.out.println();

	        if(count == arr.length) {
	            break;
	        }
	    }

		
	}
}
